FROM amazoncorretto:21
LABEL author=moisesandrade
ENV DB_USER=sa
ENV DB_PASSWORD=123456
WORKDIR /app
COPY app.jar ./
ENTRYPOINT ["java", "-jar", "app.jar"]