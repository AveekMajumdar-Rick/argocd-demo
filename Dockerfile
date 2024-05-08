FROM openjdk:17-jdk-alpine
COPY target/k8s-argocd-demo-1.0.0-SNAPSHOT.jar k8s-argocd.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/k8s-argocd.jar" ]