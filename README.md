# argocd-demo
Demo to integrate Kubernetes cluster with argo-cd

#### few commands

##### install minikube

minikube start

minikube dashboard 

kubectl create -f ./kubernetes/deployement.yaml -n argocd-application

kubectl create -f ./kubernetes/service.yaml -n argocd-application

kubectl port-forward -n argocd-application argocd-demo-deployment-549f6947c7-hqw2x 8080:8080

argocd admin initial-password -n argocd
 
kubectl port-forward -n argocd svc/argocd-server 8081:443
