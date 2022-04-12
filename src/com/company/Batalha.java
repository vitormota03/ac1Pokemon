package com.company;

public class Batalha {
    private String meuPokemonNome;
    private String adversarioPokemonNome;

    private int meuPokemonVida;
    private int adversarioPokemonVida;

    private int meuPokemonAtaque;
    private int adversarioPokemonAtaque;

    public void meuPokemon(String nome, int vida, int ataque) {
        this.meuPokemonNome = nome;
        this.meuPokemonVida = vida;
        this.meuPokemonAtaque = ataque;

    }

    public void adversarioPokemon(String nome, int vida, int ataque) {
        this.adversarioPokemonNome = nome;
        this.adversarioPokemonVida = vida;
        this.adversarioPokemonAtaque = ataque;

    }

    public void duelo() {

        System.out.println("Prepare sua pokebola!!!\nEm:\n3\n2\n1\n\nFIGHT!");
        System.out.println("\n*\n*\n*");
        System.out.println("Analisando a batalha...\n\n\n");

        if (meuPokemonVida > adversarioPokemonVida && meuPokemonAtaque > adversarioPokemonAtaque) {

            System.out.println(meuPokemonNome + " WIN!!!\n\nPerfect!!!\n\n");

        } else {
            System.out.println(adversarioPokemonNome + " WIN.\nRecolha o " + meuPokemonNome + " e o treine mais");
        }

    }

}
