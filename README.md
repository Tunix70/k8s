# Getting Started

Kubik application was created for study purpose and probably to deploy application in k8s in the future.

In order to run k8s cluster in Docker I used kind tool.

## Build application and push image to docker hub
 docker build . -t tunix70/kubik:0.0.1

 docker push tunix70/kubik:0.0.1

## Set up kind cluster
 kind create cluster --config kind-config.yaml

### Install ingress nginx plugin via kind
 kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/main/deploy/static/provider/kind/deploy.yaml

### Setup Ingress
kubectl wait --namespace ingress-nginx --for=condition=ready pod --selector=app.kubernetes.io/component=controller --timeout=90s

## Apply k8s layers
 kubectl apply -f k8s/deployment.yaml

 kubectl apply -f k8s/service.yaml

 kubectl apply -f k8s/ingress.yaml

//todo 
use env variables via template
