FROM openjdk:17
EXPOSE 8080


COPY BackendAwsDeployeDemo/target/githubactionsawsdeploy.jar /githubactionsawsdeploy.jar
ENTRYPOINT ["java", "-jar", "/githubactionsawsdeploy.jar"]