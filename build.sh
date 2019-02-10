mvn -f config clean install -DskipTests;
mvn -f registry clean install -DskipTests;
mvn -f products clean install -DskipTests;
docker-compose build;