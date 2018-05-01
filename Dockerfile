FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/demo.jar target/app.jar
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","target/app.jar"]