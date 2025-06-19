
# 🚀 App Login - Sistema de Autenticação com Spring Boot

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-59666C?style=for-the-badge)
![HTML](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)

---

## 📖 Descrição

O **App Login** é uma aplicação web de autenticação desenvolvida com foco em aprendizado, prática de boas práticas com Java e Spring Boot e construção de um portfólio atrativo para recrutadores.

Esta aplicação possui:

- Cadastro e login de usuários com validações.
- Acesso restrito ao dashboard utilizando **cookies de autenticação**.
- Sistema de logout que revoga o acesso ao dashboard.
- Páginas HTML criadas por **Inteligência Artificial** para fins de layout, focando o desenvolvimento do backend e integração com o frontend.

---

## ⚙️ Tecnologias Utilizadas

- **Java 24**
- **Spring Boot 3.5.0**
- **Spring Web**
- **Spring Data JPA**
- **Thymeleaf**
- **MySQL**
- **Spring Validation**
- **Spring Dev Tools**

---

## 🎯 Objetivo

Este projeto foi desenvolvido com o propósito de:

- Praticar a criação de aplicações web com **autenticação e controle de sessão**.
- Consolidar conhecimentos em **Spring Boot**, **JPA**, **Thymeleaf** e **integração com banco de dados**.
- Simular um cenário real de desenvolvimento com separação de responsabilidades entre `Model`, `Repository`, `Service` e `Controller`.

---

## 📁 Clonando e Rodando o Projeto Localmente

### ✅ Pré-requisitos:

- Java 17 ou superior
- MySQL instalado e rodando
- Maven instalado (ou via IntelliJ)

### 📦 Clone o repositório:

```bash
git clone https://github.com/seu-usuario/app-login.git
cd app-login
````

### ⚙️ Configure o banco de dados:

1. Crie o banco de dados com o nome `applogin` no MySQL:

```sql
CREATE DATABASE applogin;
```

2. Crie o arquivo `application-secret.properties` em `src/main/resources` com as credenciais:

```properties
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

---

## ▶️ Como Usar

1. **Execute a aplicação** via IntelliJ ou comando:

```bash
./mvnw spring-boot:run
```

2. Acesse no navegador:

```
http://localhost:8080/login
```

3. Faça o cadastro de um novo usuário:

```
http://localhost:8080/cadastroUsuario
```

4. Após login, você será redirecionado ao dashboard:

* ✅ Se o **cookie de autenticação** estiver presente → acesso liberado
* ❌ Caso contrário → redirecionamento automático para a tela de login

5. Para sair, clique no botão **"Sair"**, que remove o cookie e protege novamente o acesso.

---

## 📚 Conhecimentos Adquiridos

* Organização de projeto backend em camadas (MVC + Service)
* Manipulação de cookies em Java/Spring para controle de sessão
* Validação de formulários com Spring Validation
* Integração segura com MySQL via JPA
* Separação de dados sensíveis via `application-secret.properties`
* Uso do IntelliJ e GitHub no fluxo real de desenvolvimento

---

## 📄 Licença

Este projeto foi desenvolvido **apenas para fins educacionais e de inspiração**.
Você pode utilizá-lo como base para estudos e criação de projetos próprios.

---

📌 *As páginas HTML utilizadas no frontend foram geradas com auxílio de Inteligência Artificial para simulação visual da aplicação.*
