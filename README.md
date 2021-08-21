# App Posts compartinhados

Esse projeto consiste de um app onde é possível criar um post, onde será possível adicionar o usuário e o texto de forma livre. Além disso, os posts que forem listados, poderão receber "upvotes".

## Tecnologias utilizadas

- Spring Boot: frameworks muito utilizada para criação de API´s Rest em Java e de fácil utilização devido a grande quantidade de recursos que a mesma trás.
- Maven: É uma ferramenta muito utilizada para realizar várias operações como build e install, e também para o gerenciamento de dependências.
- H2 Database: Nesse projeto, foi utilizado o banco de dados H2, que gera um banco em memoria e facilita o processo de persistência de dados para testar o funcionamento da aplicação.
- Lombok: Muito utilizado para a criação de códigos mais limpos, evitando os chamados códigos "boilerplates", melhorando a leitura dos códigos e agilizando o tempo do desenvolvedor.
- JUnit: Utilizado para a realização de testes unitários.
- Angular 11: Para o frontend, foi utilizado o Angular 11, um ótimo framework para criação de aplicações web que trabalha com componentes.
- Bootstrap: Foi utilizada a biblioteca Bootstrap para trazer um visual mais elaborado para o projeto.

## Execução do projeto.

Para execução do projeto, é necessário clonar ou baixar o zip contendo todos os arquivos.

### Executando o Backend

Para executar o backend, basta abrir o projeto na IDE de sua preferência e clicar em run, ou atravéz de um terminal, digitar o seguinte comando:
```
mvn spring-boot:run
```

### Executando o Frontend

Para executar o frontend basta seguir os seguintes passos:

- Abra um terminal na pasta do arquivo e digite o seguinte comando:
```
npm install
```
Com esse comando, serão baixadas as dependências necessárias. Após o final da instalação, basta digitar o comando a seguir:
```
ng serve
```

Assim que a aplicação subir, basta abrir um navegador com o seguinte endereço:
````
http://localhost:4200
```