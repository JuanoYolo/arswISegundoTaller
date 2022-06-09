import java.util.List;

public class MeanDesvEstan {

    public MeanDesvEstan(List<Double> ln) {
    }

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
        System.out.println("La desviacion estandar es: " + desvEstandar);
    }

    public void printMean(List<Double> ln){
        double cont = 0;
        for (int i = 0; i < ln.size(); i++) {
            double num = ln.get(i);
            cont += num;
        }
        double promedio = (cont/ln.size());
        System.out.println("El promedio es: " + promedio);
    }
}

