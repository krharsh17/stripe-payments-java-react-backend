FROM openjdk:22-oraclelinux8

LABEL maintainer="krharsh17"

WORKDIR app

COPY . /app

RUN ./mvnw clean package

COPY ./target/backend.jar backend.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "backend.jar"]