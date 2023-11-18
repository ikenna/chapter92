#!/usr/bin/env bash
set -x
kubectl get pods
kubectl get pods -o=jsonpath='{.items[0].metadata.name}'
POD_NAME=$(kubectl get pods -o=jsonpath='{.items[0].metadata.name}')
printf "\n"
echo "POD_NAME=$POD_NAME"
kubectl wait --for=condition=Ready pod/$POD_NAME --timeout=60s
kubectl logs $POD_NAME --tail=20
kubectl wait --for=condition=Ready deployment/product-api
kubectl describe pods
printf "\n ==== Running curl"
curl --location 'http://localhost:8000/v1/catalog/products/1a7322e3-df81-8362-998c-50c67c6f8a15' \
--header 'Accept: application/vnd.api+json'