FROM amazoncorretto:17
MAINTAINER rinzlerflynn115
COPY k8stest-0.0.1-SNAPSHOT.jar k8stest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/k8stest-0.0.1-SNAPSHOT.jar"]