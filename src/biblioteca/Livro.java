package biblioteca;

class Livro extends ItemBiblioteca {

    public Livro(String titulo, String autor) {
        super(titulo, autor);
    }

    public String obterInformacoes() {
        return "Livro: " + titulo + ", Autor: " + autor;
    }
}

