FROM openjdk:17
ARG JAR_FILE=target/*.jar
ARG WAIT_FILE=/wait-for-it-master/*.sh
COPY ${WAIT_FILE} wait.sh
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["./wait.sh", "localhost:8888", "--", "java","-jar","/app.jar"]