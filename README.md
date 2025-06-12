# 📚 Sistema Simples de Gerenciamento de Biblioteca

Este projeto é uma aplicação básica de console desenvolvida em **Java**, criada para ajudar a entender e praticar conceitos de **Programação Orientada a Objetos (POO)** e o uso de estruturas de dados **`List`**. Ele simula um sistema rudimentar de gerenciamento de biblioteca onde você pode gerenciar livros e registrar aluguéis.

---

## ✨ Funcionalidades

* **Gerenciamento de Livros:**
    * Adicionar novos livros com título, autor e um código único.
    * Remover livros pelo seu código.
    * Listar todos os livros disponíveis.
* **Gerenciamento de Aluguéis:**
    * Registrar um locatário com nome, email e telefone.
    * Associar um aluguel a um livro existente usando seu código.
    * Listar todos os aluguéis registrados, incluindo detalhes do locatário e do livro alugado.

---

## 🎯 Conceitos Demonstrados

Este projeto é um excelente ponto de partida para entender:

* **Programação Orientada a Objetos (POO):**
    * **Classes e Objetos:** `Book` e `Renter` são classes que representam entidades do mundo real, e suas instâncias são objetos.
    * **Encapsulamento:** Dados (atributos) dentro de `Book` e `Renter` são privados, e o acesso é controlado por métodos *getter* públicos.
    * **Construtores:** Usados para inicializar objetos quando são criados.
* **Java Collections Framework:**
    * **`ArrayList`:** Usado para armazenar coleções de objetos `Book` e `Renter`, demonstrando capacidades de arrays dinâmicos.
    * **`List` Interface:** Programando para a interface (`List<Book>`) em vez da implementação concreta (`ArrayList<Book>`) para maior flexibilidade.
* **Entrada e Saída Básica de Usuário:** Utilizando `Scanner` para entrada via console e `System.out.println` para saída.
* **Controle de Fluxo:** Laços `do-while` para navegação no menu e instruções `switch` para lidar com diferentes opções do usuário.
* **Expressões Lambda (Java 8+):** Demonstradas em `books.removeIf(book -> book.getCode().equals(removeCode))` e operações de *stream* para busca.

---

## 🤝 Contribuição

Este projeto foi criado para fins de estudo. Sinta-se à vontade para fazer um *fork*, experimentar o código e sugerir melhorias!
