FROM java:8-jdk-alpine
COPY ./target/employee-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "employee-0.0.1-SNAPSHOT.jar"]
