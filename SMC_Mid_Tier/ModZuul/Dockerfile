# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="jitianzhi"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 9000 available to the world outside this container
EXPOSE 9000

# The application's jar file
ARG JAR_FILE=SmcZuul-1.0-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} SmcZuul.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/SmcZuul.jar"]