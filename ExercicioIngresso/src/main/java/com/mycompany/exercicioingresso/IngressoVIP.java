package com.mycompany.exercicioingresso;

/**
 *
 * @author Vinicius
 */
public class IngressoVIP extends Ingresso {
    
    private float valorAdicional;

    public IngressoVIP(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    @Override
        public String toString(){
        return "Valor do ingresso: " + (this.valorAdicional + valor);
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
}
