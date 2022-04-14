FROM openjdk:8
EXPOSE 8090
ADD target/JDK-cloud.jar JDK-cloud.jar
ARG JAR_FILE
COPY ${JAR_FILE} JDK-cloud.jar
ENTRYPOINT ["java","-jar","/JDK-cloud.jar"]
