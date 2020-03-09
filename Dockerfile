FROM openjdk:8
EXPOSE 8081
ADD target/docker-spring-boot.jar docker-spring-boot.jar
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]