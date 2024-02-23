package ejerderesta;

public class Resta {

    // Calcula la resta a y b (verifica antes cual es el menor para hacer a-b o b-a)
    public int calcularResta(int a, int b) {

        int resta = 0;

        if (a > b) {
            resta = a - b;
        } else {
            resta = b - a;
        }

        return resta;

    }
}
