# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Maven Wrapper and make it executable
COPY mvnw .
COPY .mvn .mvn

# Copy the Maven project files
COPY pom.xml .

# Copy the source code
COPY src ./src

# Make the Maven Wrapper executable
RUN chmod +x mvnw

# Package the application
RUN ./mvnw clean package

# Run the application
CMD ["java", "-jar", "target/your-app-name.jar"]
