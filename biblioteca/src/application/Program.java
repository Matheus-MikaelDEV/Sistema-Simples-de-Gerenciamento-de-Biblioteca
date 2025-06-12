package application;

import entties.Book;
import entties.Renter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        List<Renter> renters = new ArrayList<>();

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] - Mais sobre livros\n[2] - Cadastrar alugueis\n[3] - Listar alugueis\n[4] - Sair");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    int bookOption = 0;
                    do {
                        System.out.println("Opções sobre livros:");
                        System.out.println("[1] - Adicionar livro\n[2] - Remover livro\n[3] - Listar livros\n[4] - Voltar");
                        bookOption = sc.nextInt();
                        sc.nextLine();
                        switch (bookOption) {
                            case 1:
                                System.out.print("Digite o título do livro: ");
                                String title = sc.nextLine();
                                System.out.print("Digite o autor do livro: ");
                                String author = sc.nextLine();
                                System.out.print("Digite o código do livro: ");
                                Integer code = sc.nextInt();
                                sc.nextLine();

                                books.add(new Book(title, author, code));
                                break;
                            case 2:
                                System.out.print("Digite o código do livro a ser removido: ");
                                Integer removeCode = sc.nextInt();
                                sc.nextLine();
                                books.removeIf(book -> book.getCode().equals(removeCode));
                                System.out.println("Livro removido com sucesso!");
                                break;
                            case 3:
                                System.out.println("Lista de livros:");
                                for (Book book : books) {
                                    System.out.println("Título: " + book.getTitle() + ", Autor: " + book.getAuthor() + ", Código: " + book.getCode());
                                }
                                break;
                            case 4:
                                System.out.println("Voltando ao menu principal...");
                                break;
                        }
                    }while (bookOption != 4);
                    break;
                case 2:
                    for (Book book : books) {
                        System.out.println("Título: " + book.getTitle() + ", Autor: " + book.getAuthor() + ", Código: " + book.getCode());
                    }

                    System.out.print("Digite o nome do locatário: ");
                    String renterName = sc.nextLine();
                    System.out.print("Digite o email do locatário: ");
                    String renterEmail = sc.nextLine();
                    System.out.print("Digite o telefone do locatário: ");
                    String renterPhone = sc.nextLine();
                    System.out.print("Digite o código do livro que irá alugar: ");
                    Integer bookCode = sc.nextInt();
                    sc.nextLine();
                    if (books.stream().anyMatch(book -> book.getCode().equals(bookCode))) {
                        renters.add(new Renter(renterName, renterEmail, renterPhone, bookCode));
                    } else {
                        System.out.println("Livro não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("Lista de alugueis:");
                    for (Renter renter : renters) {
                        System.out.println("Nome: " + renter.getName() + ", Email: " + renter.getEmail() + ", Telefone: " + renter.getPhone() + ", Código do livro alugado: " + renter.getCodeBookRanted());
                        System.out.println("Detalhes do livro alugado:");
                        System.out.println("Nome do livro: " + books.stream().filter(book -> book.getCode().equals(renter.getCodeBookRanted())).findFirst().get().getTitle());
                        System.out.println("Autor do livro: " + books.stream().filter(book -> book.getCode().equals(renter.getCodeBookRanted())).findFirst().get().getAuthor());
                        System.out.println("Código do livro: " + books.stream().filter(book -> book.getCode().equals(renter.getCodeBookRanted())).findFirst().get().getCode());
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    sc.close();
                    return;
            }
        }while (true);
    }
}