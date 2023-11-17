
FROM maven:3.8.5-openjdk-17 AS build

RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
EXPOSE 8080
ENTRYPOINT ["java", "-jar" , "demo.jar"]