package com.company;
import java.util.Random;

public class Pokemon {
    Random random = new Random();
    int valor = random.nextInt(3) + 1;

    private String nome;
    private String tipo;
    private String habilidade;
    private int vida;
    private int ataque;

    public void pokemonFogo(String nome, String tipo, String habilidade, int vida, int ataque) {
        this.nome = "Charmander";
        this.tipo = "Fogo";
        this.habilidade = "Lanca-chamas";
        this.vida = 100;
        this.ataque = 60;

        pokemonCharmander();

    }

    public void pokemonAgua(String nome, String tipo, String habilidade, int vida, int ataque) {
        this.nome = "Squirtle";
        this.tipo = "Agua";
        this.habilidade = "Jato d'agua";
        this.vida = 110;
        this.ataque = 50;

        pokemonSquirtle();
    }

    public void pokemonEletrico(String nome, String tipo, String habilidade, int vida, int ataque) {
        this.nome = "Pikachu";
        this.tipo = "Eletrico";
        this.habilidade = "Choque do trovao";
        this.vida = 90;
        this.ataque = 65;

        pokemonPikachu();
    }

    public void pokemonPlanta(String nome, String tipo, String habilidade, int vida, int ataque) {
        this.nome = "Bulbasauro";
        this.tipo = "Planta";
        this.habilidade = "Tempestade de petalas";
        this.vida = 85;
        this.ataque = 70;

        pokemonBulbasauro();
    }

    public void pokemonCharmander() {
        System.out.println(
                "*Nome do Pokemon: " + nome + "\n*"
                        + "Tipo do Pokemon: " + tipo + "\n*"
                        + "Habilidade do Pokemon: " + habilidade + "\n*"
                        + "Vida do Pokemon: " + vida + "\n*"
                        + "Ataque do Pokemon: " + ataque);

    }

    public void pokemonSquirtle() {
        System.out.println(
                "*Nome do Pokemon: " + nome + "\n*"
                        + "Tipo do Pokemon: " + tipo + "\n*"
                        + "Habilidade do Pokemon: " + habilidade + "\n*"
                        + "Vida do Pokemon: " + vida + "\n*"
                        + "Ataque do Pokemon: " + ataque);

    }

    public void pokemonPikachu() {
        System.out.println(
                "*Nome do Pokemon: " + nome + "\n*"
                        + "Tipo do Pokemon: " + tipo + "\n*"
                        + "Habilidade do Pokemon: " + habilidade + "\n*"
                        + "Vida do Pokemon: " + vida + "\n*"
                        + "Ataque do Pokemon: " + ataque);

    }

    public void pokemonBulbasauro() {
        System.out.println(
                "*Nome do Pokemon: " + nome + "\n*"
                        + "Tipo do Pokemon: " + tipo + "\n*"
                        + "Habilidade do Pokemon: " + habilidade + "\n*"
                        + "Vida do Pokemon: " + vida + "\n*"
                        + "Ataque do Pokemon: " + ataque);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    private void calculaPokemon() {
        switch (tipo) {
            case "Fogo":
                vida += 0;
                ataque += 0 * valor;
                break;

            case "Agua":
                vida += 0;
                ataque += 0 * valor;
                break;

            case "Planta":
                vida += 0;
                ataque += 0 * valor;
                break;

            case "Eletrico":
                vida += 0;
                ataque += 0 * valor;
                break;
        }

    }

    private void calcularBoost() {

        vida = +(ataque / 2);
        ataque = +(vida / 2);

    }

}
