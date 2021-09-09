FROM openjdk:8
ADD target/cicdconn.jar cicdconn.jar
EXPOSE 5000
ENTRYPOINT ["java","-jar","cicdconn.jar"]