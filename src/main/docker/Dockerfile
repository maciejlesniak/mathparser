FROM centos:centos7
MAINTAINER maciek@sparkmedia.pl

# Update system and install tools
RUN yum install -y wget && \
yum clean all

# Install Java
RUN wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/8u91-b14/jdk-8u91-linux-x64.rpm" && \
yum localinstall -y jdk-8u91-linux-x64.rpm && \
rm -f jdk-8u91-linux-x64.rpm

ENV JAVA_HOME /usr/java/jdk1.8.0_91/jre
VOLUME /tmp
ADD *.jar app.jar
EXPOSE 8080
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]