# InstaClone

Spring Boot + MySQL Instagram-style Java web application organized to match the requested master-branch layout.

## Structure

- Docker-app/ — application Dockerfile
- Docker-db/ — MySQL Dockerfile and init script
- manifests/ — Kubernetes manifest
- src/ — Spring Boot source and templates
- compose.yml — multi-container deployment
- pom.xml — Maven configuration

## Run

```bash
docker compose up --build
```

Open http://localhost:8080

