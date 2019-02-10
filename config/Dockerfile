FROM java:8
RUN mkdir -p /usr/src/app
RUN mkdir -p /usr/src/app/config
WORKDIR /usr/src/app
ADD ./target /usr/src/app
CMD java -jar config-server*.jar