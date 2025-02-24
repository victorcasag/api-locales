# 🌍 API de Autenticação e Pesquisa de Localização

Esta é uma API desenvolvida em **Java Spring Boot** que permite autenticação de usuários e pesquisa de cidades, estados e países em qualquer lugar do mundo.

## 🔥 Funcionalidades

✅ **Autenticação de Usuário** (Login com JWT)  
✅ **Pesquisa de Localização** (Cidades, estados e países)  
✅ **Integração com API Externa** para dados de localização  
✅ **Segurança com Spring Security e JWT**  
✅ **Arquitetura RESTful**  

## 🚀 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Security + JWT  
- Spring Data JPA  
- PostgreSQL (ou outro banco de dados relacional)  
- OpenAPI (Swagger)  
- API externa para busca de localização (ex: OpenCage, GeoNames, etc.)  

## 📌 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   cd nome-do-repositorio
   ```

2. Configure o banco de dados no `application.properties` ou `application.yml`.

3. Execute o projeto com:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a documentação Swagger em:
   ```
   http://localhost:8080/swagger-ui.html
   ```

## 📡 Endpoints Principais

### 🔑 Autenticação
- `POST /auth/login` → Gera token JWT para acesso  
- `POST /auth/register` → Cadastro de usuário  

### 🌎 Localização
- `GET /location/city?name={nome}` → Busca cidade  
- `GET /location/state?name={nome}` → Busca estado  
- `GET /location/country?name={nome}` → Busca país  

## 🛠 Melhorias Futuras

- 🚀 Implementação de caching para otimizar buscas  
- 📍 Adicionar suporte a coordenadas geográficas  
- 🔍 Melhorar validação de entrada de dados  

Sinta-se à vontade para contribuir! 🎉