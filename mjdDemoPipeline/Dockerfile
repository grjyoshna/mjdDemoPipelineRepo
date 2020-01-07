#FROM java:8
#EXPOSE 8080
#ADD target/mjdDemoPipeline-0.0.1-SNAPSHOT.war mjdDemoPipeline-0.0.1-SNAPSHOT.war
#ENTRYPOINT ["java", "-war","mjdDemoPipeline-0.0.1-SNAPSHOT.war"]

From tomcat
ADD mjd-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
CMD "catalina.sh" "run"
EXPOSE 8080
