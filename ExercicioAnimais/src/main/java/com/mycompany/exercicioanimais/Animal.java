/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioanimais;

/**
 *
 * @author aluno
 */
public class Animal {
    private String nome;
    private double comprimento;
    private int numPatas = 4;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal(String nome, double comprimento, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public void dados(){
        System.out.println("Animal: "+nome+"\nComprimento: "+ comprimento + "\nPatas: "+numPatas+"\nCor"+cor+"\nAmbiente: "+ambiente+"\nVelocidade: "+velocidade+"m/s");
    }
}
