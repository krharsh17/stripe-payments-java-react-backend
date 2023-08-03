FROM openjdk:22-oraclelinux8

LABEL maintainer="krharsh17"

WORKDIR /app

COPY . /app

RUN ./mvnw clean package

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/target/backend.jar"]