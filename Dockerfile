FROM eclipse-temurin:17
COPY target/flipkart.jar flipkart.jar
CMD ["java", "-jar", "flipkart.jar"]