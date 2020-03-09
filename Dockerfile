FROM openjdk:8
EXPOSE 8080
COPY target/docker-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]