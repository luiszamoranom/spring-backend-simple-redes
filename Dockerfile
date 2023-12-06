FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

RUN apt-get remove -y maven && apt-get autoremove -y && apt-get clean && rm -rf /var/lib/apt/lists/*

COPY --from=0 /app/target/*.jar /app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
