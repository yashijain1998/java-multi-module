# Maven project for Module with SPI

This is a maven project which uses modules to communicate  with each other.

## Getting Started

### Prerequisites
- Before proceeding with this part, your local development machine must have the following installed:
  - GIT CLI - To clone this repository
  - pre install jdk 11 and set it's path in system environment variable.
  - pre install maven and set it's path in system environment variable.

### 1. Cloning the repository
```bash
# Clone the Repo
$ git clone https://github.com/yashijain1998/java-multi-module.git

# Go to repo
$ cd java-multi-module

``` 

### 2. Compile the Project
Use maven to compile this project
```bash
# Compile the program
$ mvn clean compile
```

### 3. Run the program
Simply run the shell script present in the root folder.

```bash
# Run the program
$ ./run-module.sh
```

## Introduction
### Parent POM
There is a single parent pom in a root folder which has 3 child modules
- moduleone
- moduletwo
- modulethree

### Child POM

#### 1. moduleone Module
In this module, there is a single class `VehicleProvider.java` which has a interface that is going to use as a `Service Provider Interface`

#### 2. moduletwo Module
This module is going to provide the body for `Service Provider Interface`. It has three classes `BikeService.java`, `CarService.java`, `TruckService.java` right now which act as a `Service Provider`.

#### 3. modulethree Module
It is `ServiceLoader` class which loads API module and uses it in `ServiceLoaderclass.java`





