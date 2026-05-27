# Assistência Técnica — Sistema de Ordens de Serviço

Sistema backend para gerenciamento de ordens de serviço de uma assistência técnica em domicílio. O atendimento cobre equipamentos das marcas Samsung e LG (lavadoras, secadoras, lava e seca), com agendamento, controle de peças e registro de pagamentos.

## Tecnologias

- Java 17
- Spring Boot 3.5.14
- Spring Data JPA / Hibernate
- MySQL 8
- Maven
- Lombok

## Como rodar

**Pré-requisitos:** Java 17, MySQL 8 e Maven instalados.

Clone o repositório:

    git clone https://github.com/Givanildo-Santana/assistencia-tecnica.git

Crie o banco de dados no MySQL:

    CREATE DATABASE assistencia_tecnica;

Configure as credenciais copiando o arquivo de exemplo:

    cp src/main/resources/application.properties.example src/main/resources/application.properties

Edite o `application.properties` com seu usuário e senha do MySQL, depois rode:

    ./mvnw spring-boot:run

## Estrutura do projeto

    src/main/java/.../
    ├── controller/    # endpoints REST
    ├── service/       # regras de negócio
    ├── repository/    # acesso ao banco
    ├── domain/        # entidades e enums
    └── dto/           # objetos de entrada e saída da API

## Diagrama de Entidade e Relacionamento

![DER](docs/DER.png)

## Endpoints disponíveis

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | /clientes | Lista todos os clientes |
| GET | /clientes/{id} | Busca cliente por ID |
| POST | /clientes | Cadastra novo cliente |
| PUT | /clientes/{id} | Atualiza cliente |
| DELETE | /clientes/{id} | Remove cliente |

## Status

Projeto em desenvolvimento. Endpoints de clientes concluídos.
Próximas entregas: técnicos, ordens de serviço, agendamentos e pagamentos.