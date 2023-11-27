FROM alpine:3.18.4
RUN apk add openjdk17
COPY build/libs/kubik.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]