#! /bin/bash

# This is the module script!
java --module-path "loader/target/classes;serviceProvider/target/classes;impl/target/classes;" --module loader/com.example.loader.ServiceLoaderclass