package Atividade11;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Livro l1 = new Livro(new ArrayList());

        l1.adicionarLivro(new SuperLivro( "pequeno principe","pedro", 230));
        l1.adicionarLivro(new SuperLivro("capitao cueca","odair de aumeida",35));
        l1.adicionarLivro(new SuperLivro("a arte de amar","triglece",75));
        l1.adicionarLivro(new SuperLivro("grande coruja","linda blar",40));
        l1.adicionarLivro(new SuperLivro("segredos dos omi","tao de olho em nois",408));


        l1.mostrarLivros();
        System.out.println("\n\n\n");

        l1.mostrarAcima50();

        l1.precoMedio();


    }

}
