FROM openjdk:8-jre-alpine
ADD target/raja.jar raja.jar
CMD java -jar /raja.jar
EXPOSE 80
