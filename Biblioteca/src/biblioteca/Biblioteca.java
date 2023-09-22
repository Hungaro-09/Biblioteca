
package biblioteca;

import java.util.Scanner;


public class Biblioteca {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
        int menu;
        double vInicial, vFinal;
        Livros objLivro;
        
        String titulo,autor,genero;
        float preco;
        int isbn;
        
        do{
            exibirMenu();
            menu = entrada.nextInt();
            switch(menu){
                case 1:
                    System.out.println("Digite o título: ");
                    titulo = entradaString.nextLine();
                    System.out.println("Digite o autor: ");
                    autor = entradaString.nextLine();
                    System.out.println("Digite o genero: ");
                    genero = entradaString.nextLine();
                    System.out.println("Digite a ISBN: ");
                    isbn = entrada.nextInt();
                    System.out.println("Digite o preço: ");
                    preco = entrada.nextFloat();
                    
                    objLivro = new Livros(titulo,autor,isbn,genero,preco);
                    
                    Acervo.adicionar(objLivro);
                    break;
                 case 2:
                    System.out.println("Listagem de Livros");
                    System.out.println(Acervo.listar());
                    break;
                 case 3:
                    System.out.println("Excluir Livro");
                    System.out.println("Digite o título do livro: ");
                    titulo = entradaString.nextLine();
                    
                    if(! (Acervo.getListaLivros().isEmpty())){
                        if(Acervo.remover(titulo)){
                            System.out.println("Livro removido com sucesso");
                        }else{
                              System.out.println("Título não foi encontrado");
                        }
                        
                    }else{
                          System.out.println("Não existem livros no acervo!!");
                          
                    }
            
                    break;
                 case 4:
                       System.out.println("Escola pelo genero");
                       System.out.println("Digite o genero: ");
                       genero = entradaString.nextLine();
                       System.out.println("Existem "+Acervo.pesquisar(genero)
                       + "Livrro do genero selecionado"+genero);           
                    break;
                 case 5:
                       System.out.println("Pesquisa por faixa de preço: ");
                       System.out.println("Digite a faixa inicial e a final: ");
                       vInicial = entrada.nextDouble();
                       vFinal = entrada.nextDouble();
                       System.out.println("Existem "+Acervo.pesquisar(vInicial, vFinal)
                       +"Livros com preço entre "
                       +String.format("R$ %.2f e R$%.2f \n",vInicial, vFinal));                                               
                    break;
                 case 6:
                       System.out.println("O Total em R$ de livros no Acervo: ");
                       System.out.println("O total é:  "+ String.format("R$ %.2f \n",Acervo.calcularTotalAcervo() ));
              
                     break;
                 case 7:
                      System.out.println("Terminando o programa..");
     
                     break;
                 default:
                       System.out.println("Opção Invalida");
                
            }
            
        }while(menu != 7);
        
    }
    static void exibirMenu(){
        System.out.println("-----Trabalho POO-----");
        System.out.println("1-Cadastrar");
        System.out.println("2-Listar");
        System.out.println("3-Excluir Livro");
        System.out.println("4-Pesquisar por Genero");
        System.out.println("5- Pesquisar por faixa de preço: ");
        System.out.println("6-Calcular total do acervo");
        System.out.println("7-Sair");
        System.out.println("Escolha uma opção: ");
    }
        
    }
    

