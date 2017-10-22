FROM java
WORKDIR /opt
COPY test.jar /opt/
ENTRYPOINT ["java", "-jar", "/opt/test.jar"]
EXPOSE 8081