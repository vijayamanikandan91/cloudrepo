FROM eclipse-temurin:17
COPY target/cloudwebapp.jar cloudwebapp.jar
CMD ["java","-jar","cloudwebapp.jar"]