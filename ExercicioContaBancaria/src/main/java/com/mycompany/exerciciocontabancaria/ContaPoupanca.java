/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciocontabancaria;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, float saldo) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
   }
    public void calcularNovoSaldo(float taxa){
        super.depositar((taxa / 100) * diaRendimento);
    }
}
