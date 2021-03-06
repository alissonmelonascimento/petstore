# sobre o projeto

O projeto tem como objetivo mostrar um exemplo de modularização de uma aplicação Quarkus usando extensões criadas pelo próprio desenvolvedor.

Foram criados dois módulos: um módulo principal que receberá as requisições e repassará para um backend disponível na internet (https://petstore.swagger.io/) usando rest client e outro módulo para gravar dados de auditoria das requisições efetuadas.

Para ter acesso ao código-fonte do modulo responsável pela gravação dos dados no banco, acesse: https://github.com/alissonmelonascimento/petstore-audit

# executando o projeto

<ul>
  <li>Instale o docker</li>
  <li>Na linha de comando do seu sistema operacional, navegue até a pasta do projeto e digite "docker-compose up"</li>
  <li>Aguarde o docker instalar as imagens e subir o serviço</li>
  <li>Para subir a aplicação digite "mvn docker:dev"</li>
  <li>Para ver os serviços disponíveis, acesse o swagger da aplicação: http://localhost:8080/swagger-ui/</li>
</ul>

# petstore project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `petstore-1.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/petstore-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/petstore-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.
