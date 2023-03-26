# Demo with Logging for Spring Boot Microservices [![Twitter](https://img.shields.io/twitter/follow/piotr_minkowski.svg?style=social&logo=twitter&label=Follow%20Me)](https://twitter.com/piotr_minkowski)

[![CircleCI](https://circleci.com/gh/piomin/sample-microservices-logstash.svg?style=svg)](https://circleci.com/gh/piomin/sample-spring-microservices-new)

Before running the app start Logstash:
```shell
$ docker run -d -it --name logstash -p 5000:5000 logstash -e 'input { tcp { port => 5000 codec => "json" } } output { elasticsearch { hosts => ["localhost"] index => "account-service"} }'
```