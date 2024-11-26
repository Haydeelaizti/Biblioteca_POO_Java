package biblioteca;

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
                    System.out.println("Opção para adicionar livro selecionada.");
                    break;

                case 2:
                    System.out.println("Opção para adicionar revista selecionada.");
                    break;

                case 3:
                    System.out.println("Opção para adicionar usuário selecionada.");
                    break;

                case 4:
                    System.out.println("Opção para listar itens selecionada.");
                    break;

                case 5:
                    System.out.println("Opção para listar usuários selecionada.");
                    break;

                case 6:
                    System.out.println("Opção para gerar relatório selecionada.");
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

