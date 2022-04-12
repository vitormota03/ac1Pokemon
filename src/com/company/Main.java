package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pokemon meuPokemon = new Pokemon();
        Pokemon adversarioPokemon = new Pokemon();

        Scanner ler = new Scanner(System.in);

        String p;
        String a = null;

        System.out.println(
                "Jogador, digite um tipo para seu pokemon.\nSendo ele:\n"
                        + "\n*FOGO\n"
                        + "*AGUA\n"
                        + "*ELETRICO\n"
                        + "*PLANTA\n");
        System.out.println("(Exemplo de escolha: 'FOGO')");
        System.out.print("Sua escolha: ");
        p = ler.next();

        if (p.equals("FOGO") || p.equals("fogo") || p.equals("Fogo")) {
            System.out.println("\nSua escolha foi: " + p + " \n");
            meuPokemon.pokemonFogo(p, p, p, 0, 0);

        } else if (p.equals("AGUA") || p.equals("agua") || p.equals("Agua")) {
            System.out.println("\nSua escolha foi: " + p + " \n");
            meuPokemon.pokemonAgua(p, p, p, 0, 0);

        } else if (p.equals("ELETRICO") || p.equals("eletrico") || p.equals("Eletrico")) {
            System.out.println("\nSua escolha foi: " + p + " \n");
            meuPokemon.pokemonEletrico(p, p, p, 0, 0);

        } else if (p.equals("PLANTA") || p.equals("planta") || p.equals("Planta")) {
            System.out.println("\nSua escolha foi: " + p + " \n");
            meuPokemon.pokemonPlanta(p, p, p, 0, 0);

        } else {
            System.out.println("\nTipo de Pokemon nao listado.\n(Dica: digite sem acento, se for o caso).");
        }

        if (
                p.equals("FOGO") || p.equals("fogo") || p.equals("Fogo")
                        || p.equals("AGUA") || p.equals("agua") || p.equals("Agua")
                        || p.equals("ELETRICO") || p.equals("eletrico") || p.equals("Eletrico")
                        || p.equals("PLANTA") || p.equals("planta") || p.equals("Planta")
        ) {

            System.out.println("-----------------------------------------------------------------------------------");

            System.out.println(
                    "Agora, digite qual Pokemon deseja ter como adversario:\n"
                            + "\n*FOGO\n"
                            + "*AGUA\n"
                            + "*ELETRICO\n"
                            + "*PLANTA\n");
            System.out.print("Sua escolha: ");
            a = ler.next();
            if (a.equals("FOGO") || a.equals("fogo") || a.equals("Fogo")) {
                System.out.println("\nO tipo do Pokemon adversario e: " + a + " \n");
                adversarioPokemon.pokemonFogo(a, a, a, 0, 0);

            } else if (a.equals("AGUA") || a.equals("agua") || a.equals("Agua")) {
                System.out.println("\nO tipo do Pokemon adversario e: " + a + " \n");
                adversarioPokemon.pokemonAgua(a, a, a, 0, 0);

            } else if (a.equals("ELETRICO") || a.equals("eletrico") || a.equals("Eletrico")) {
                System.out.println("\nO tipo do Pokemon adversario e: " + a + " \n");
                adversarioPokemon.pokemonEletrico(a, a, a, 0, 0);

            } else if (a.equals("PLANTA") || a.equals("planta") || a.equals("Planta")) {
                System.out.println("\nO tipo do Pokemon adversario e: " + a + " \n");
                adversarioPokemon.pokemonPlanta(a, a, a, 0, 0);

            } else {
                System.out.println("\nTipo de Pokemon nao listado.\n(Dica: digite sem acento, se for o caso)");
            }

        } else {
            System.out.println("Digite um tipo de Pokemon valido.");
        }

        if (
                a.equals("FOGO") || a.equals("fogo") || a.equals("Fogo")
                        || a.equals("AGUA") || a.equals("agua") || a.equals("Agua")
                        || a.equals("ELETRICO") || a.equals("eletrico") || a.equals("Eletrico")
                        || a.equals("PLANTA") || a.equals("planta") || a.equals("Planta")

        ) {

            System.out.println("-----------------------------------------------------------------------------------");

            Batalha batalha = new Batalha();

            batalha.meuPokemon(meuPokemon.getNome(), meuPokemon.getAtaque(), meuPokemon.getVida());
            batalha.adversarioPokemon(adversarioPokemon.getNome(), adversarioPokemon.getAtaque(), adversarioPokemon.getVida());

            batalha.duelo();

        }

    }
}
