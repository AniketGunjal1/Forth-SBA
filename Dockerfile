FROM openjdk:17
EXPOSE 9006
ADD target/spring-arraylist-employee-docker.jar spring-arraylist-employee-docker.jar
ENTRYPOINT ["java","-jar","/spring-arraylist-employee-docker.jar"]