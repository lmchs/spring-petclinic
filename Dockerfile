FROM public.ecr.aws/bitnami/java:1.8

#ARG profile=dev

COPY target/ocp-1-0.0.1-SNAPSHOT.jar /ocp-1-0.0.1-SNAPSHOT.jar
COPY docker/20accfbb-5bcd-4edc /20accfbb-5bcd-4edc
#COPY docker/logback.xml /logback.xml
#COPY docker/dockerStarter.ksh /dockerStarter.ksh
#RUN chmod 777 /dockerStarter.ksh
#RUN mkdir /logs
#RUN chmod -R 777 /logs

ENTRYPOINT ["sh","-c","java -jar -Dspring.profiles.active=dev /*.jar"]

#ENTRYPOINT ["/dockerStarter.ksh"]
#CMD [${profile}]