FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} /app.jar
#COPY entrypoint.sh /entrypoint.sh
#RUN chmod +x /entrypoint.sh
#ENTRYPOINT ["/entrypoint.sh"]
ENTRYPOINT ["java", "-Xms256m", "-Xmx512m","-XX:+ExitOnOutOfMemoryError","-XX:+CrashOnOutOfMemoryError","-Dspring.profiles.active=prod", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
#EXPOSE ${PORT}