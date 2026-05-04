package Atividade11;


import java.util.*;
import java.util.stream.Collectors;


public class Livro<T extends SuperLivro> {


//    private String titulo;
//    private String autor;
//    private double preco;
//

    private List<T> listaLivro;


//    public Livro(String titulo, String autor, double preco) {
//        this.titulo = titulo;
//        this.autor = autor;
//        this.preco = preco;
//}

    public Livro(List<T> listaLivro) {
        this.listaLivro = listaLivro;
    }


//    public double getPreco() {
//        return preco;
//    }
//
//
//    public List<T> getListaLivro() {
//        return listaLivro;
//    }
//
//
//    public String getTitulo() {
//        return titulo;
//    }




    public void mostrarLivros(){


        listaLivro.forEach(m -> System.out.println(m)); //usando o forEach
    }

    public void precoMedio(){

       // double media = listaLivro.stream().mapToDouble(p -> p.getPreco()).average().orElse(Double.NaN);
        // sem o '.orElse()' o avarage n funciona pois a lista pode estar vazia

      //  System.out.println("a media do preco dos livros é de: " + media);
    }

    public void mostrarAcima50(){


        List<T> listaFiltrada = listaLivro.stream().filter( p -> p.getPreco() >= 50).collect(Collectors.toList());


        listaFiltrada.forEach(m -> System.out.println(m));
    }


    public void adicionarLivro(T adicionou){


        listaLivro.add(adicionou);
    }


    public void tituloMaiusculo(){
       // List<> maiusculo = new ArrayList();
      //  maiusculo.add( listaLivro.stream().map(p -> getTitulo().toUpperCase()));
        //map modifica a lista original sem muda-la / serve para realizar alguma operacao


       // maiusculo.forEach(m -> System.out.println(m));
    }




//    @Override
//    public String toString() {
//        return "Livro{" +
//                "titulo='" + titulo + '\'' +
//                ", autor='" + autor + '\'' +
//                ", preco=" + preco +
//
//
//
//
//                '}';
//    }
}
