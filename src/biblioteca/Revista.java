package biblioteca;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, String autor, int edicao) {
        super(titulo, autor);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String obterInformacoes() {
        return "Revista: " + titulo + ", Autor: " + autor + ", Edição: " + edicao;
    }
}
