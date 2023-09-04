FROM openjdk:17
EXPOSE 8080
ADD target/test.jar test.jar
ENTRYPOINT ["java","-jar","/test.jar"]