package biblioteca;
import java.util.ArrayList;
import java.util.List;

abstract class ItemBiblioteca {
    protected String titulo;
    protected String autor;

    public ItemBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

        public abstract String obterInformacoes();
}