FROM gradle:7.0-jdk11 AS build

COPY . /home/gradle/src/
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:11-jre-slim

EXPOSE 8083
RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/jibby-jabber-post-latest.jar /app/spring-boot-application.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=production", "/app/spring-boot-application.jar"]