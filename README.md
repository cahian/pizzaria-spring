# Pizzaria

Pizzaria online utilizando Spring Boot

## Configuração

### Banco de dados

Abra um terminal (prompt de comando no Microsoft Windows) e abra um cliente MySQL como um usuário que pode criar novos usuários:

```
$ mysql -u root -p
```

Para criar um novo banco de dados, execute os seguintes comandos no prompt do `mysql`:

```
mysql> create database db_example; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
```

## Execução

Você pode executar a aplicação usando:

```
$ ./mvnw spring-boot:run
```

Como alternativa, você pode construir o arquivo JAR com o pacote ./mvnw clean e, em seguida, executar o arquivo JAR, da seguinte forma:

```
$ ./mvnw clean package
$ java -jar target/pizzaria-0.0.1-SNAPSHOT.jar
```
