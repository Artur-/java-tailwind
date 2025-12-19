import * as fs from 'fs';
import * as path from 'path';
import yargs from 'yargs';
import { hideBin } from 'yargs/helpers';

export interface GroupingConfig {
  enabled: boolean;
  structure: {
    [topLevelCategory: string]: {
      subcategories?: string[];
      categories: string[];
    };
  };
}

export interface GeneratorConfig {
  tailwind: {
    version: string;
    configFile: string;
    inputCss: string;
    testContent: string;
  };
  java: {
    package: string;
    className: string;
    sinceVersion: string;
  };
  output: {
    directory: string;
    createPackageStructure: boolean;
  };
  breakpoints: {
    [key: string]: string;
  };
  grouping?: GroupingConfig;
}

export interface Metadata {
  tailwindVersion: string;
  totalUtilities: number;
}

/**
 * Gets the default configuration
 */
function getDefaultConfig(): GeneratorConfig {
  return {
    tailwind: {
      version: 'auto',
      configFile: 'tailwind.config.js',
      inputCss: 'input.css',
      testContent: 'test-content.html'
    },
    java: {
      package: 'com.vaadin.flow.component.tailwind',
      className: 'TW',
      sinceVersion: '25.1'
    },
    output: {
      directory: '../../output',
      createPackageStructure: true
    },
    breakpoints: {
      'sm': '640px',
      'md': '768px',
      'lg': '1024px',
      'xl': '1280px',
      '2xl': '1536px'
    }
  };
}

/**
 * Reads Tailwind CSS version from package.json
 */
export function getTailwindVersion(): string {
  const packageJsonPath = path.join(__dirname, '..', 'package.json');

  if (!fs.existsSync(packageJsonPath)) {
    throw new Error('package.json not found');
  }

  const pkg = JSON.parse(fs.readFileSync(packageJsonPath, 'utf-8'));
  const version = pkg.dependencies?.tailwindcss ||
                  pkg.devDependencies?.tailwindcss ||
                  pkg.dependencies?.['@tailwindcss/cli'] ||
                  pkg.devDependencies?.['@tailwindcss/cli'];

  if (!version) {
    throw new Error('Tailwind CSS not found in package.json dependencies');
  }

  // Remove ^ or ~ prefix
  return version.replace(/^[\^~]/, '');
}

/**
 * Parses command-line arguments
 */
function parseCliArgs() {
  return yargs(hideBin(process.argv))
    .option('config', {
      type: 'string',
      description: 'Path to config file',
      default: 'generator.config.json'
    })
    .option('package', {
      type: 'string',
      description: 'Java package name'
    })
    .option('version', {
      type: 'string',
      description: 'Tailwind CSS version (or "auto")'
    })
    .option('since', {
      type: 'string',
      description: 'Vaadin/Flow version for @since tag'
    })
    .option('output', {
      type: 'string',
      description: 'Output directory path'
    })
    .option('class-name', {
      type: 'string',
      description: 'Java class name'
    })
    .help()
    .parseSync();
}

/**
 * Loads and merges configuration from file and CLI args
 */
export function loadConfig(): GeneratorConfig {
  const args = parseCliArgs();

  // Read config file
  const configPath = path.join(__dirname, '..', args.config as string);
  let config: GeneratorConfig;

  if (fs.existsSync(configPath)) {
    console.log(`Loading config from: ${configPath}`);
    config = JSON.parse(fs.readFileSync(configPath, 'utf-8'));
  } else {
    console.log('No config file found, using defaults');
    config = getDefaultConfig();
  }

  // Override with CLI args if provided
  if (args.package) {
    console.log(`  Overriding package: ${args.package}`);
    config.java.package = args.package as string;
  }
  if (args.version) {
    console.log(`  Overriding version: ${args.version}`);
    config.tailwind.version = args.version as string;
  }
  if (args.since) {
    console.log(`  Overriding since: ${args.since}`);
    config.java.sinceVersion = args.since as string;
  }
  if (args.output) {
    console.log(`  Overriding output: ${args.output}`);
    config.output.directory = args.output as string;
  }
  if (args['class-name']) {
    console.log(`  Overriding class name: ${args['class-name']}`);
    config.java.className = args['class-name'] as string;
  }

  // Auto-detect Tailwind version if needed
  if (config.tailwind.version === 'auto') {
    config.tailwind.version = getTailwindVersion();
    console.log(`  Auto-detected Tailwind version: ${config.tailwind.version}`);
  }

  return config;
}

/**
 * Creates metadata object
 */
export function createMetadata(tailwindVersion: string, totalUtilities: number): Metadata {
  return {
    tailwindVersion,
    totalUtilities
  };
}
