FROM openjdk:17
LABEL authors="rajdeepaksahoo"
COPY target/Docker02-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]