FROM openjdk:8-jdk-alpine
ADD target/raja-0.1.jar raja.jar
CMD java -XX:+UseG1GC -Xmx4096m -Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true -jar /raja.jar
EXPOSE 80
