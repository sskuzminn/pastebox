FROM openjdk:17-alpine
MAINTAINER Sergey Kuzmin
COPY target/pastebox-0.0.1-SNAPSHOT.jar pastebox.jar
ENTRYPOINT ["java", "-jar", "/pastebox.jar"]