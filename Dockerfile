FROM openjdk:21
ADD target/DevOpsApp-0.0.1-SNAPSHOT.war DevOpsApp.war
ENTRYPOINT ["java","war","/DevOpsApp.war"]
