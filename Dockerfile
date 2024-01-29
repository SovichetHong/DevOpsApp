FROM openjdk:21
ADD target/DevOpsApp.war DevOpsApp.war
ENTRYPOINT ["java", "-jar" ,"/DevOpsApp.war"]
