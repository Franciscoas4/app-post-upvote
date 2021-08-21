# Backend Post compartilhados

Este projeto consiste em uma API Rest, que irá receber um post e um usuário. Após a inserção, será gerado uma lista com os post que foram criados e será possível dar "upvotes" em cada um desses posts.


## Descrição

Na aplicação, é possivel:
- Listar os postes atuais e seus "upvotes";
- Adicionar um novo post;
- Adicionar um "upvote" a um post;
- Foi utilizado o banco de dados de teste H2 para persistir os dados.


## Tecnologias escolhidas

Para o cumprimento do desafio, as frameworks abaixo foram escolhidas, por possuir mais familiaridade:
- Spring Boot: O Spring é uma das melhores opções para criação de API´s Rest, fácil de trabalhar e muito intuitivo. Com várias feramentas embutidas, uma maior facilidade para manutenção e com annotations que tornam a aplicação mais limpa, de fácil categorização de cada parte da aplicação e maior eficiência.
- Java 11 LTS: Foi utilizada para essa aplicação a versão 11 do Java em sua versão de longo prazo. O Java é uma linguagem de programação muito robusta e continua sendo muito utilizada no mercado.
- Maven: O Maven é uma ótima ferramenta para o gerenciamento de projetos, sua facilidade para utilizar e o extenso repositório que possui, facilita a busca e implemetação de dependências que facilitam o desenvolvimento.
- H2 Database: O H2 foi utilizado por fornecer um banco de dados de teste em memoria que facilita o teste da API.
- JPA/Hibernate: O JPA/Hibernate foram utilizados para facilitar o mapeamento das entidades e criação das tabelas.
- Lombok: Para evitar código boilerplate, ou seja, códigos repitidos, torando o código muito extenso e de difícil compreensão.

## Executando a API

Para execução da API, você pode utilizar a IDE de sua preferência e solicitar a inicialização do programa, ou através do comando do Maven, mvn spring-boot:run.

A API irá funcionar na porta 8080, através do endereço http://localhost:8080.

Utilizando o endereco http://localhost:8080/h2-console será aberto o banco de testes H2 onde será possível verificar as tabelas que foram criadas.

A aplicação possui um frontend em Angular para facilitar a execução e manipulação da API.