#!/usr/bin/env bash
kubectl get pods
kubectl get pods -o=jsonpath='{.items[0].metadata.name}'
POD_NAME=$(kubectl get pods -o=jsonpath='{.items[0].metadata.name}')
echo "\nPOD_NAME=$POD_NAME"
kubectl wait --for=condition=Ready pod/$POD_NAME --timeout=60s
kubectl logs $POD_NAME --tail=20