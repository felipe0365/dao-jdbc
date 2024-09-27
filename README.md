# 🗄️ DAO Pattern - JDBC Demo

Este projeto é uma demonstração da implementação do padrão de projeto **DAO (Data Access Object)** utilizando JDBC. O padrão DAO separa a lógica de persistência de dados das regras de negócio, proporcionando uma camada dedicada para manipulação dos dados de uma entidade. 📂

## 🎯 Objetivo

Implementar um sistema simples de acesso a dados com JDBC, utilizando o padrão DAO para as operações de CRUD em entidades como **Departamento** e **Vendedor**.

## 📚 Referências

- [DAO Pattern - DevMedia](https://www.devmedia.com.br/dao-pattern-persistencia-de-dados-utilizando-o-padrao-dao/30999)
- [DAO Pattern - Oracle](https://www.oracle.com/technetwork/java/dataaccessobject-138824.html)

## 🏗️ Estrutura do Projeto

Para cada entidade, temos um objeto DAO responsável por realizar as operações no banco de dados.

### Entidades:

- `Department`
- `Seller`

### DAOs:

- `DepartmentDao`
- `SellerDao`

## 🔧 Configuração do Projeto

1. Crie um novo projeto no GitHub e adicione o arquivo `.gitignore` específico para Java.
2. No **Eclipse**, crie um novo projeto Java e adicione a biblioteca **MySQLConnector**.
3. Copie o pacote `db` e o arquivo `db.properties` deste repositório: [JDBC Demo](https://github.com/acenelio/jdbc5).
4. Configure o repositório local e faça o push para o GitHub:

   ```bash
   git init
   git remote add origin https://github.com/acenelio/jdbc-dao-demo.git
   git pull origin master
   git add .
   git commit -m "Project created"
   git push -u origin master

## 🚀 Funcionalidades Implementadas

- **findById**: Busca um vendedor pelo ID.
- **findByDepartment**: Busca todos os vendedores de um departamento.
- **findAll**: Lista todos os vendedores.
- **insert**: Insere um novo vendedor.
- **update**: Atualiza as informações de um vendedor.
- **delete**: Remove um vendedor do banco de dados.


## 📝 Consultas SQL Utilizadas

### findById:
```sql
SELECT seller.*, department.Name as DepName 
FROM seller INNER JOIN department 
ON seller.DepartmentId = department.Id 
WHERE seller.Id = ?
```

### findByDepartment:

```sql
SELECT seller.*, department.Name as DepName 
FROM seller INNER JOIN department 
ON seller.DepartmentId = department.Id 
WHERE DepartmentId = ? 
ORDER BY Name
```

### findAll:

```sql
SELECT seller.*,department.Name as DepName  
FROM seller INNER JOIN department  
ON seller.DepartmentId = department.Id 
ORDER BY Name
```

### insert:

```sql
INSERT INTO seller 
(Name, Email, BirthDate, BaseSalary, DepartmentId)  
VALUES  
(?, ?, ?, ?, ?)
```

### update:

```sql
DELETE FROM seller  
WHERE Id = ? 
```



