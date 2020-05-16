#!/bin/sh

# build image
sudo docker build [Dockerfile dir] -t shaban/test_java

# compile code
sudo docker run -it -v /home/shaban/Desktop/docker-tinker/java/code:/usr/src/app shaban/test_java javac Main.java

# run code
sudo docker run -it -v /home/shaban/Desktop/docker-tinker/java/code:/usr/src/app shaban/test_java java Main