# Base Imaage Ubuntu 24.04
FROM ubuntu:24.04

# Given the name of Maintainer
LABEL Ram Niwash

# Updating the System Package
RUN apt-get update -y

# Copying the Project
COPY MyJRE /home/root/MyJRE

# Moving to Working Directory
WORKDIR  /home/root/MyJRE/bin/

# Running the Application
CMD ./myapp

