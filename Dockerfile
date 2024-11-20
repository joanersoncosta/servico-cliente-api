FROM openjdk:17

ARG JAR_FILE=./target/*.jar

EXPOSE 8080

COPY ${JAR_FILE} cdk-service-cliente.jar

ENTRYPOINT ["java", "-jar", "cdk-service-cliente.jar"]