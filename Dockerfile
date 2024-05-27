# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project files and dependencies
COPY pom.xml .
COPY src ./src

# Package the application
RUN ./mvnw package

# Run the application
CMD ["java", "-jar", "target/your-app-name.jar"]
