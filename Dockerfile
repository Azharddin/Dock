FROM eclipse-temurin:17
COPY target/Dock.jar Dock.jar
CMD [ "java","-jar","Dock.jar" ]