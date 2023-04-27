package com.mycompany.exercicioingresso;

/**
 *
 * @author Vinicius
 */
public class Ingresso {
    protected float valor;
    
    public Ingresso(float valor){
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Valor do ingresso: " + this.valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
