# jdbc

https://swagger.io/tools/swagger-codegen/
https://start.spring.io/
- spring boot
- git aliser


🧠 O que isso significa

Esse dependency é do:

👉 SpringDoc OpenAPI (Swagger UI)
springdoc-openapi

Ele serve para:

gerar documentação automática da API REST
abrir interface Swagger no navegador
testar endpoints (GET, POST, etc.)
✅ Como deveria ficar

Você precisa colocar uma versão real, por exemplo:

<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>
🌐 O que ele ativa no seu projeto

Depois de rodar o Spring Boot, você consegue acessar:

http://localhost:8080/swagger-ui.html

ou

http://localhost:8080/swagger-ui/index.html
💡 Resumo simples
❌ compile não é versão
✅ você precisa de um número tipo 2.5.0
📌 essa lib gera Swagger UI automaticamente
