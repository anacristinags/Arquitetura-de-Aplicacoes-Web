# Prova de Arquitetura de Aplicações WEB
## 📚 CRUD de Alunos e Cursos – Spring Boot + MariaDB

Este projeto é uma aplicação Java desenvolvida com Spring Boot que realiza operações de CRUD para duas entidades: `Aluno` e `Curso`, com relacionamento entre elas. Utiliza persistência de dados com **JPA** e banco de dados **MariaDB**, seguindo boas práticas REST e simplificação de código com **Lombok**.

---

## 📑 Sumário  
- [🎯 Objetivo e Tecnologias Utilizadas](#-objetivo-e-tecnologias-utilizadas)  
- [🔗 Relacionamento entre as Entidades](#-relacionamento-entre-as-entidades)  
- [💾 Como Rodar o Projeto](#-como-rodar-o-projeto)  
- [🔁 Endpoints da API](#-endpoints-da-api)  
- [💡 Exemplos de Requisição (Postman)](#-exemplos-de-requisição-postman)  
- [🎥 Imagens e Vídeos](#-imagens-e-vídeos)

---

## 🎯 Objetivo e Tecnologias Utilizadas

Implementar uma aplicação Spring Boot que:

- Realiza CRUD completo para `Aluno` e `Curso`.
- Integra o banco de dados MariaDB com mapeamento JPA correto.
- Utiliza **Lombok** para reduzir boilerplate.
- Implementa relacionamento entre entidades com persistência real de dados.

### 🛠️ Tecnologias Utilizadas   

- **Java 17**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
  - Spring Boot DevTools
  - Lombok
  - MariaDB Driver
- **MariaDB**
- **Postman** (para testes de API)

---

## 🔗 Relacionamento entre as Entidades:
Segue uma imagem do relacionameto entre as entidades do Banco de Dados:
<div align="center"> <img src="https://github.com/user-attachments/assets/62aaafbf-12b7-4942-aacd-d5eb88e16586" width="700px" />
</div>  

- Um **Curso** pode ter **vários Alunos** (`@OneToMany`)
- Um **Aluno** está relacionado a **um Curso** (`@ManyToOne`)

### Entidades

**Aluno**:
- `id`: Long  
- `nome`: String  
- `email`: String  
- `dataNascimento`: LocalDate  
- `curso`: Curso (relacionamento)

**Curso**:
- `id`: Long  
- `nomeCurso`: String  
- `descricao`: String  
- `cargaHoraria`: Integer  
- `alunos`: List<Aluno>

---

## 💾 Como rodar o projeto

### 1. Clonar o repositório

```bash
git clone https://github.com/anacristinags/Arquitetura-de-Aplicacoes-Web/tree/main/crud
```

### 2. Configurar o banco de dados

* Inicie o XAMPP e ative o MySQL.
* Acesse o phpMyAdmin e crie um banco com o nome `crud_escola`.

> Caso deseje outro nome, edite o arquivo:
`src/main/resources/application.properties`
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/seu_nome_do_banco
```

### 3. Rodar a Aplicação
1. No **Visual Studio Code**, abra a aba lateral **"Spring Boot Dashboard"**.
2. Localize o projeto na lista e clique no botão **"Run"** ▶️ para iniciar a aplicação.
3. Após a inicialização, a aplicação estará rodando em: http://localhost:8080

---

## 🔁 Endpoints da API

### 📘 Alunos                                                            

| Método | Endpoint        | Descrição                         | 
|--------|------------------|-----------------------------------|
| GET    | /alunos          | Retorna todos os alunos           |
| GET    | /alunos/{id}     | Retorna um aluno pelo ID          | 
| POST   | /alunos          | Cria um novo aluno                |
| PUT    | /alunos/{id}     | Atualiza os dados de um aluno     | 
| DELETE | /alunos/{id}     | Remove um aluno pelo ID           | 


### 📗 Cursos

| Método | Endpoint        | Descrição                         |
|--------|------------------|-----------------------------------|
| GET    | /cursos          | Retorna todos os cursos           | 
| GET    | /cursos/{id}     | Retorna um curso pelo ID          | 
| POST   | /cursos          | Cria um novo curso                | 
| PUT    | /cursos/{id}     | Atualiza os dados de um curso     | 
| DELETE | /cursos/{id}     | Remove um curso pelo ID           | 

---

## 💡 Exemplos de Requisição (Postman)

### POST /cursos
```bash
{
  "nomeCurso": "Arquitetura de Software",
  "descricao": "Estudo da estrutura de sistemas.",
  "cargaHoraria": 60
}
```

### POST /alunos
```bash
{
  "nome": "Ana Cristina",
  "email": "anaExemplo@gmail.com",
  "dataNascimento": "2004-10-10",
  "curso": {
    "id": 1
  }
}
```

## 🎥 Imagens e Vídeos  

### ➕ Adicionando um Novo Curso  
<a href="https://github.com/user-attachments/assets/24fae2c2-c544-49af-a36d-2f58413d83a5" target="_blank">▶️ Ver vídeo</a>

---

### ➕ Adicionando um Novo Aluno  
<a href="https://github.com/user-attachments/assets/1b9eed6c-9fdc-4b5b-8f6a-548dad5e7c62" target="_blank">▶️ Ver vídeo</a>

---

### 🗂️ Banco de Dados Atualizado Após Cadastro  
![Tabela curso atualizada](https://github.com/user-attachments/assets/ff61f5d4-bb55-487a-b605-d49f05b15e1d)

---

### 🗑️ Deletando Aluno e Curso  
<a href="https://github.com/user-attachments/assets/1c72b95e-d5a9-4748-aa18-063e441b208b" target="_blank">▶️ Ver vídeo</a>

---

### 🗂️ Banco de Dados Atualizado Após Exclusão  
![Tabela curso limpa](https://github.com/user-attachments/assets/f8171325-46bc-439c-ae81-1368cea6eb1b)


## 👩‍💻 Desenvolvido por

**Ana Cristina Siqueira**

Este projeto foi criado como parte da avaliação prática da disciplina **Arquitetura de Aplicações Web**, com foco em **persistência de dados**, **boas práticas REST** e **integração com banco de dados relacional** utilizando **Spring Boot** e **MariaDB**.
