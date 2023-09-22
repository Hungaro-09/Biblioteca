
package biblioteca;


public class Livros {
    private String titulo;
    private String autor;
    private int isbn;
    private String genero;
    private float preço;

    public Livros() {
    }

    public Livros(String titulo, String autor, int isbn, String genero, float preço) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.preço = preço;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }
    public String mostrarInformacoes(){
        return "Titulo: " + titulo + "\nAutor: " + autor+ 
                "\nISBN: "+isbn+"\nGenero: "+genero+
                String.format("\nPreço: R$ %.2f \n",preço);
    }
}
