FROM openjdk:11
EXPOSE 8080
COPY build/libs/springboot-docker-0.0.1-SNAPSHOT.jar springbootapp-docker.jar
ENTRYPOINT ["java", "-jar", "/springbootapp-docker.jar"]