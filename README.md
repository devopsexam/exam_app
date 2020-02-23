##PGR301 Exam

Add environment variables  before doing anything else, then run the application.

##Environment variables

Set your own environment variables.  

* DOCKER_USERNAME
* DOCKER_PASSWORD
* GRAFANA_AUTH
* GRAFANA_URL

Set up environment variables ex.: "export DOCKER_USERNAME=your_username"

##Content
- Repository with both infrastructure and application
- Embedded H2 database, accessible through localhost:8080/h2
- Docker builds a container image of the application
- Travis builds a new image for every commit