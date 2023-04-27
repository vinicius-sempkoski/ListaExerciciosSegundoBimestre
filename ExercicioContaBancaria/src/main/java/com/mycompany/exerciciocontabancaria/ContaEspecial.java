/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciocontabancaria;

/**
 *
 * @author aluno
 */
public class ContaEspecial extends ContaBancaria {

    private float limite;

    public ContaEspecial(float limite, String cliente, int numConta, float saldo) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor > (saldo + limite)) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

}
