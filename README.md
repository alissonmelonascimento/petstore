# sobre o projeto

O projeto tem como objetivo exemplificar como modularizar uma aplicação Quarkus usando extensões criadas pelo próprio desenvolvedor.

Para este projeto, foi criado um módulo separado que faz a gravação de dados de auditoria das requisições feita ao petshop.

Para ter acesso ao código-fonte do modulo responsável pela gravação dos dados no banco, acesse: https://github.com/alissonmelonascimento/petstore-audit

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
