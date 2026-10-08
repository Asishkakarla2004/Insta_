FROM mysql:8.4
ENV MYSQL_DATABASE=instaclone MYSQL_USER=instaclone MYSQL_PASSWORD=instaclone MYSQL_ROOT_PASSWORD=root
COPY init.sql /docker-entrypoint-initdb.d/01-init.sql
