# Docker
### _Pushing Docker image to Docker Hub_
##### 1. Create a docker account
##### 2. Login to Docker hub from cmd
- $ docker login
Login with your Docker ID to push and pull images from Docker Hub. If you don't have a Docker ID, head over to https://hub.docker.com to create one.
Username: shashidhar0508
password:
##### 3. Tagging the image
- docker tag {image_name} {user_name}/{image_name}
- $ docker tag spingboot-docker-demo shashidhar0508/spingboot-docker-demo
- After this a new image will be created with above tag name
##### 4. Pushing to Docker Hub
- docker push {user_name}/{image_name}
- $ docker push shashidhar0508/spingboot-docker-demo
