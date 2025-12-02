💻 Laboratório API RESTful: Jakarta EE (JAX-RS + EJB)
📌 Visão Geral

Este projeto é um laboratório prático da disciplina de Sistemas Distribuídos que demonstra a criação e implantação de uma API RESTful simples utilizando o stack de tecnologias Jakarta EE.

A API implementa um serviço de saudação, utilizando JAX-RS para definir o endpoint e EJB Stateless para encapsular a lógica de negócio, sendo implantada no servidor de aplicações WildFly.
🛠️ Tecnologias Utilizadas

    Linguagem: Java 17+

    Gerenciador de Build: Apache Maven

    Especificações REST: Jakarta RESTful Web Services (JAX-RS)

    Componente de Serviço: Jakarta Enterprise Beans (EJB) Stateless

    Servidor de Aplicações: WildFly (compatível com Jakarta EE 10)

📂 Estrutura do Projeto

A estrutura de diretórios do projeto (padrão Maven Web Archive - WAR) é a seguinte:

HelloAPI/
├── pom.xml
└── src/
    └── main/
        ├── java/
        │   └── com/exemplo/
        │       ├── HelloResource.java     # Recurso JAX-RS (Endpoint)
        │       ├── HelloService.java      # EJB Stateless (Lógica de Negócio)
        │       └── RestApplication.java   # Configuração base do JAX-RS
        └── webapp/
            └── WEB-INF/

Detalhes das Classes
Arquivo	Função	Anotações Principais
RestApplication.java	Define o caminho base da API.	@ApplicationPath("/api")
HelloResource.java	Endpoint REST. Injeta o EJB.	@Path("/hello"), @GET, @Inject
HelloService.java	Camada de Serviço (EJB).	@Stateless
⚙️ Como Compilar e Executar

Siga os passos abaixo para compilar o projeto e realizar a implantação (deploy) no WildFly.
Pré-requisitos

    Java JDK (17 ou superior)

    Apache Maven

    Servidor de Aplicações WildFly (versão 27+ ou 30+ para Jakarta EE 10)

1. Compilação do Projeto

Navegue até o diretório raiz do projeto (HelloAPI) e utilize o Maven para compilar o código e gerar o arquivo WAR:
Bash

mvn clean package

Saída Esperada: O Maven gerará o arquivo de implantação: target/HelloAPI-1.0-SNAPSHOT.war
2. Implantação (Deploy) no WildFly

Com o servidor WildFly em execução, copie o arquivo gerado para a pasta monitorada:

    Inicie o WildFly (exemplo no Linux): ~/servers/wildfly-30.0.1.Final/bin/standalone.sh

    Copie o WAR para a pasta de deployments (Ajuste o caminho conforme sua instalação):

Bash

cp target/HelloAPI-1.0-SNAPSHOT.war /caminho/do/seu/wildfly/standalone/deployments/

Confirmação de Deploy: O log do WildFly deve exibir uma mensagem de sucesso, indicando que a aplicação foi registrada:

WFLYSRV0010: Deployed "HelloAPI-1.0-SNAPSHOT.war" (runtime-name : "HelloAPI-1.0-SNAPSHOT.war")

🚀 Teste da API

Após o deployment ser concluído com sucesso, a API estará acessível.
URL de Acesso

O endpoint final é:

http://localhost:8080/HelloAPI-1.0-SNAPSHOT/api/hello/{nome}
Validação com cURL

Utilize o curl no terminal para testar o serviço, substituindo {nome} pelo valor desejado:
Bash

curl http://localhost:8080/HelloAPI-1.0-SNAPSHOT/api/hello/Pedro

Resposta Esperada: O retorno deve ser a mensagem processada pelo EJB:

Olá, Pedro! Bem-vindo à API EJB.

📝 Autor

    Nome: Pedro Wilson C. Parreira

    Matrícula: 541491

    Curso: Engenharia de Computação