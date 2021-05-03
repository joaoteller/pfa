FROM openjdk:8-jdk-alpine
COPY target/fpa-app.jar fpa-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "fpa-app.jar"]