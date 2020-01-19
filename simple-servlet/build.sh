#Maven build to generate war
mvn clean install -DskipTests
mv target/simple-servlet-0.0.1-SNAPSHOT.war target/simple-servlet.war


#Clean up images and containers
docker container rm --force $(docker container ls -aq)
docker image rm --force $(docker image ls -aq)

#Docker container start
docker-compose down
docker-compose up

