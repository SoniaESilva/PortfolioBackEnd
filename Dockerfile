FROM amazoncorretto:17-alpine-jdk

MAINTAINER soniasilva

COPY target/ArgentinaPrograma-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
