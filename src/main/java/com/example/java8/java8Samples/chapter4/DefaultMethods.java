package com.example.java8.java8Samples.chapter4;

import com.example.java8.java8Samples.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethods {
    public static void main(String... args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        //List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        Consumer<Usuario> mostraMensagem = u ->
                System.out.println("antes de imprimir os nomes");
        Consumer<Usuario> imprimeNome = u ->
                System.out.println(u.getNome());
        //usuarios.forEach(mostraMensagem.andThen(imprimeNome));





        /*Predicate<Usuario> predicado = new Predicate<Usuario>() {
            public boolean test(Usuario u) {
                return u.getPontos() > 160;
            }
        };*/

        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);


        //usuarios.removeIf(predicado);
        //usuarios.forEach(u -> System.out.println(u));

        usuarios.removeIf(u -> u.getPontos() > 160);
        usuarios.forEach(u -> System.out.println(u));





    }
}
