package com.mycompany.exercicioempregados;

/**
 *
 * @author aluno
 */
public class ExercicioEmpregados {

    public static void main(String[] args) {
        Empregado a = new Empregado("Vinicius", 1000);
        System.out.println(a);

        Gerente e = new Gerente("Vinicius", 1000, "Analista");
        System.out.println(e);

        Vendedor i = new Vendedor("Vinicius", 1000, 20);
        System.out.println(i);
    }
}
