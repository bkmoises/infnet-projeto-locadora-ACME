FROM amazoncorretto:21
LABEL author=moisesandrade
EXPOSE 8761
WORKDIR /app
COPY app.jar ./
ENTRYPOINT ["java", "-jar", "app.jar"]