package linkedJavaList;

import java.util.List;

/**
 * Clase que calcula la desv Estandar y el promedio de una lista de numeros
 */
public class MeanDesvEstan {

    public MeanDesvEstan(List<Double> ln) {
    }

    /**
     * Metodo que calcula de la desv Estandar
     * @param ln LinkedList que trae la lista de numeros
     */
    public void printDesvEstandar(List<Double> ln){
        double cont = 0;
        double cont1 = 0;
        double res = 0;

        for (int i = 0; i < ln.size(); i++) {
            double num = ln.get(i);
            cont += num;
        }
        double promedio = (cont/ln.size());

        for (int j = 0; j < ln.size(); j++) {
            double num1 = ln.get(j);
            cont1 += Math.pow((num1 - promedio),2);
        }
        res = (cont1/ ln.size());
        double desvEstandar = Math.sqrt(res);
        System.out.printf("La desviacion estandar es: %.2f \n",desvEstandar);
    }

    /**
     * Metodo que calcula el promedio
     * @param ln LinkedList que trae la lista de numeros
     */
    public void printMean(List<Double> ln){
        double cont = 0;
        for (int i = 0; i < ln.size(); i++) {
            double num = ln.get(i);
            cont += num;
        }
        double promedio = (cont/ln.size());
        System.out.printf("El promedio es: %.2f \n", promedio);
    }
}

