# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="jitianzhi"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8081 available to the world outside this container
EXPOSE 8081

# The application's jar file
ARG JAR_FILE=UserService-1.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} UserService.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/UserService.jar"]