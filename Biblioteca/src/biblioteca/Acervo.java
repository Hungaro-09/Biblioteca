
package biblioteca;

import java.util.ArrayList;


public class Acervo {
    private static ArrayList<Livros>listaLivros = new ArrayList<>();

    public static ArrayList<Livros> getListaLivros() {
        return listaLivros;
    }
    static public void adicionar(Livros l){
        listaLivros.add(l);
    }
    static public String listar(){
        String saida = "";
        int i = 1;
        for(Livros l : listaLivros){
            saida += "\n=====Livro n: " +(i++) + " ====\n";
            saida += l.mostrarInformacoes()+ "\n";
        }       
        return saida;
    }
    
    static public int pesquisar(String genero){
        int qtd = 0;
        for(Livros l : listaLivros){
            if(l.getGenero().equalsIgnoreCase(genero)){
                qtd++;
            }
        }
        
        return qtd;
    }
    static public int pesquisar(double vInicial, double vFinal){
        int qtd = 0;
        
        for(Livros l : listaLivros){
            if(l.getPreço() >= vInicial && l.getPreço() <= vFinal){
                qtd++;
            }
        }
        return qtd;        
    }
    static public boolean remover(String titulo){
        for(Livros l: listaLivros){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                listaLivros.remove(l);
                return true;
            }
        }
        return false;
    }
    static double calcularTotalAcervo(){
        double total = 0;
        for(Livros l : listaLivros){
            total += l.getPreço();
        }
        return total;
    }
    
}
