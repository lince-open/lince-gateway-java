# lince-gateway-java

Solução

* Autenticação com Spring Security e uso de Header
* Testes Unitários com JUnit/Spock/Groove
* Testes Funcionais com JUnit/Spock/Groove
* Docker


#resolver pendencias

* segurança com jwt
* adicionar wiremock para testes
* implementar tratamento de erros
** not found
** repassar erros identificados


![](https://github.com/lince-open/lince-gateway-java/workflows/Java%20CI/badge.svg)
[![Known Vulnerabilities](https://snyk.io/test/github/lince-open/lince-gateway-java/badge.svg)](https://snyk.io/test/github/pedrozatta/lince-gateway-java)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=lince-open_lince-gateway-java&metric=coverage)](https://sonarcloud.io/dashboard?id=lince-open_lince-gateway-java)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=lince-open_lince-gateway-java&metric=alert_status)](https://sonarcloud.io/dashboard?id=lince-open_lince-gateway-java)


## Docker Hub

https://hub.docker.com/repository/docker/linceopen/lince-gateway

mvn clean package dockerfile:build

docker tag lince-open/lince-gateway:latest linceopen/lince-gateway:0.0.2

docker push linceopen/lince-gateway:0.0.2

docker tag lince-open/lince-gateway:latest linceopen/lince-gateway:latest

docker push linceopen/lince-gateway:latest

###GCLOUD

docker pull linceopen/lince-gateway:0.0.2

docker tag linceopen/lince-gateway:0.0.2 gcr.io/lince-work/lince-gateway:0.0.2

gcloud docker -- push gcr.io/lince-work/lince-gateway:0.0.2

###Start

docker run --name lince-gateway \
-e PORT='8080' \
-e LINCE_LOG_LEVEL='WARN' \
-e LINCE_API_PERSON='http://localhost:51002/people' \
-p 50001:8080 \
-t lince-open/lince-gateway:latest

## Execução
mvn spring-boot:run

