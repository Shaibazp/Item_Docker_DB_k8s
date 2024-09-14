FROM openjdk:17
ADD target/ItemMenu.jar ItemMenu.jar
ENTRYPOINT ["java", "-jar", "/ItemMenu.jar"]