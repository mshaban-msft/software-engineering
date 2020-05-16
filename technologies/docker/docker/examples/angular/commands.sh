#!/bin/sh

# build image
################################
sudo docker build [Dockerfile dir] -t shaban/angular

# running commands
################################
# base command
sudo docker run [flags] shaban/angular [command]

# init app
sudo docker run -it -v /home/shaban/Desktop/PROJECTS/APP/frontend/code:/usr/src/app shaban/angular ng new frontend

# run server
sudo docker run -it --network=host -v /home/shaban/Desktop/PROJECTS/APP/frontend/code:/usr/src/app shaban/angular ng serve
# or
sudo docker run -it -p 8000:4200 -v /home/shaban/Desktop/PROJECTS/APP/frontend/code:/usr/src/app shaban/angular ng serve --host 0.0.0.0