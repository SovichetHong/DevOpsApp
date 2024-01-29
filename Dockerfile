FROM openjdk:21
ADD target/DevOpsApp.war DevOpsApp.war
ENTRYPOINT ["java","war","/DevOpsApp.war"]
