# Livraria
Book Store é uma aplicação desenvolvida para estudos usando microserviços baseados na inicialização Spring. Esta aplicação tem as seguintes features 

* Registrar compradores e vendedores
* Criar registros mestre para livros
* Manter inventário de livros e de diferentes vendedores
* Manter uma visão consolidada no NoSQL (MongoDB) para pesquisar livros e ver sua disponibilidade pelos vendedores
* Fazer pedidos de um livro selecionado

## Microserviços

* Spring boot 
* Spring cloud
  * Eureka - Registro e Descoberta de Serviços
  * Cloud config - Configurações de serviços de extenalização
  * Ribbon - Balanceador de carga do lado do cliente
  * Fiegn - Interfaces Proxy para chamadas remotas
  * Hystrix - Hystrix e Hystrix Dashboard
  * Spring cloud Stream - Microserviços conduzidos com transferência de mensagens de Kafka
  * Spring Sleuth - Habiliata IDs de rastreio e Extensao para o Registro centralizado
 
* Registro centralizado (requisito de 12 fatores) usando o ELK(ElasticSearch, Logstah e Kibana)
* RabbitMQ
* MangoDB

