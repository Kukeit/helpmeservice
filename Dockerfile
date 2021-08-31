FROM openjdk:8
PORT 5000
ADD target/helpmeservice-0.0.1.jar helpmeservice-0.0.1.jar
ENTRYPOINT ["java","-jar","/helpmeservice-0.0.1.jar"]