# Phase 1: Build the Java application using Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
# Permissions issue with mvnw, so we need to make it executable before running it
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

# Phase 2: Run the compiled .jar file using a lightweight Java Runtime
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]