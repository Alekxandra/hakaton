FROM openjdk:11

ENV TZ='Europe/Moscow'

COPY target/dashboard-back-0.0.1-SNAPSHOT.jar /usr/app/dashdoard-back.jar

WORKDIR /usr/app

EXPOSE 8080

ENTRYPOINT exec java $JAVA_OPTS -jar dashdoard-back.jar