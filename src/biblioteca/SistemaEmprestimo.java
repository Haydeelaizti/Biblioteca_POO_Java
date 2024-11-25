package biblioteca;

class SistemaEmprestimo implements Relatorio {
    private List<ItemBiblioteca> itens;
    private List<Usuario> usuarios;

    public SistemaEmprestimo() {
        this.itens = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item) {
        this.itens.add(item);
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void listarItens() {
        System.out.println("Itens da Biblioteca:");
        for (ItemBiblioteca item : itens) {
            System.out.println(item.obterInformacoes());
        }
    }

    public void listarUsuarios() {
        System.out.println("Usuários cadastrados:");
        for (Usuario usuario : usuarios) {
            System.out.println("- Nome: " + usuario.getNome() + ", Matrícula: " + usuario.getMatricula());
        }
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório do Sistema de Empréstimos:");
        System.out.println("Total de itens: " + itens.size());
        System.out.println("Total de usuários: " + usuarios.size());
    }
}

