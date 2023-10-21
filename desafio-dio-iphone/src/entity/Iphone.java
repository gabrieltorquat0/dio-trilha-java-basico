package entity;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio por voz...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public void tocar() {
        System.out.println("Tocando musica...");
    }

    public void pausar() {
        System.out.println("Pausando musica...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica...");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.adicionarNovaAba();
        iphone.tocar();
        iphone.ligar();
    }
}
