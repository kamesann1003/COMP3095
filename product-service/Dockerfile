# ===========
# Docker file for product-service
# ===========

# ======================
# Build Stage
# ======================
FROM gradle:8-jdk17-alpine  AS builder

# copy the application files from the host machine to the image filesystem
COPY --chown=gradle:gradle . /home/gradle/src

# set the directory within the image, for executing future commands
WORKDIR /home/gradle/src

# run gradle build within the container - NOT the host machine
RUN gradle build -x test

# ======================
# Packet Stage
# ======================
FROM openjdk:17-alpine

RUN mkdir /app

# Copy the jar file buld jar file to the app folder
# update the name depends on what service you are containerizing
COPY --from=builder /home/gradle/src/build/libs/*.jar /app/product-service.jar

ENV MONGO_DB_USERNAME=rootadmin \
    MONGO_DB_PASSWORD=password

EXPOSE 8084

ENTRYPOINT ["java","-jar","/app/product-service.jar"]