#!/bin/bash
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker build -t devops_application --build-arg JAR_FILE=target/eksamenoving-0.0.1-SNAPSHOT.jar .
docker tag devops_application "${DOCKER_USERNAME}"/devops_application
docker push "${DOCKER_USERNAME}"/devops_application