cp /var/lib/jenkins/workspace/mjd_pipeline/mjdDemoPipeline/target/mjdDemoPipeline-0.0.1-SNAPSHOT.war .
From tomcat
ADD mjdDemoPipeline-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
CMD "catalina.sh" "run"
EXPOSE 8080
