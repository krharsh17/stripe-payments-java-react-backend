FROM openjdk:22-oraclelinux8

LABEL maintainer="krharsh17"

WORKDIR app

COPY src ./src
COPY pom.xml .
COPY .mvn ./.mvn
COPY mvnw .

RUN ./mvnw clean package

ADD target/backend.jar backend.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "backend.jar"]