FROM tomcat:7

COPY target/simple-servlet.war $CATALINA_HOME/webapps

RUN apt-get update && apt-get install -y vim