/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciocontabancaria;

/**
 *
 * @author aluno
 */
public class ContaBancaria {

    private String cliente;
    private int numConta;
    protected float saldo;

    public ContaBancaria(String cliente, int numConta, float saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this. saldo -= valor;
        }
    }
    public void depositar(float valor){
        this.saldo += valor;
    }
}
