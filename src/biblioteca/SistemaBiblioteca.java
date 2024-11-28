package biblioteca;

import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaEmprestimo sistema = new SistemaEmprestimo();

        System.out.println("Bem-vindo ao Sistema da Biblioteca!");
        boolean executando = true;

        while (executando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar Revista");
            System.out.println("3. Adicionar Usuário");
            System.out.println("4. Listar Itens");
            System.out.println("5. Listar Usuários");
            System.out.println("6. Gerar Relatório");
            System.out.println("7. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String tituloLivro = scanner.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autorLivro = scanner.nextLine();
                    sistema.adicionarItem(new Livro(tituloLivro, autorLivro));
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o título da revista:");
                    String tituloRevista = scanner.nextLine();
                    System.out.println("Digite o autor da revista:");
                    String autorRevista = scanner.nextLine();
                    System.out.println("Digite a edição da revista:");
                    int edicaoRevista = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    sistema.adicionarItem(new Revista(tituloRevista, autorRevista, edicaoRevista));
                    System.out.println("Revista adicionada com sucesso!");
                    break;

                case 3:
                    System.out.println("Digite o nome do usuário:");
                    String nomeUsuario = scanner.nextLine();
                    System.out.println("Digite a matrícula do usuário:");
                    String matriculaUsuario = scanner.nextLine();
                    sistema.adicionarUsuario(new Usuario(nomeUsuario, matriculaUsuario));
                    System.out.println("Usuário adicionado com sucesso!");
                    break;

                case 4:
                    sistema.listarItens();
                    break;

                case 5:
                    sistema.listarUsuarios();
                    break;

                case 6:
                    sistema.gerarRelatorio();
                    break;

                case 7:
                    System.out.println("Encerrando o sistema. Até mais!");
                    executando = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
