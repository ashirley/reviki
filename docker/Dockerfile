FROM tomcat:8-jre8

#copy reviki.xml and reviki.war into container
ADD context.xml /usr/local/tomcat/conf/Catalina/localhost/reviki.xml
ADD reviki.properties /reviki/test-data/reviki.properties
ADD reviki.war /reviki/reviki.war

#TODO make the above be taken from the project or release directory directly.
