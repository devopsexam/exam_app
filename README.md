##Environment variables

Set your own environment variables before running the application.  

* DOCKER_USERNAME
* DOCKER_PASSWORD
* GRAFANA_AUTH
* GRAFANA_URL

Set up environment variables ex.: "export DOCKER_USERNAME=your_username"

##Content
- Embedded H2 database, accessible through localhost:8080/h2
- Docker builds a container image of the application
- Travis builds a new image for every commit