FROM maven:3.8.3-openjdk-17 AS build
COPY . /app
WORKDIR /app
#RUN mvn clean package

FROM openjdk:17
RUN mkdir app
COPY --from=build /app/target/*.jar /app/book.jar
CMD ["java", "-jar", "/app/book.jar"]