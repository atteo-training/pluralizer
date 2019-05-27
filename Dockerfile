FROM adoptopenjdk/openjdk12:jdk-12.33-alpine

COPY target/lib /lib
COPY target/*-SNAPSHOT.jar application.jar

CMD [ "java", "-jar", "/application.jar" ]
