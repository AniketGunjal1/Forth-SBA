FROM openjdk:17
EXPOSE 9006
ADD target/spring-arraylist-employee-docker-0.0.1-SNAPSHOT.jar spring-arraylist-employee-docker.jar
ENTRYPOINT ["java","-jar","/spring-arraylist-employee-docker.jar"]


