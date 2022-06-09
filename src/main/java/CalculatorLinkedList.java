import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CalculatorLinkedList {
    public static void main(String[] args) {
        File file = new File(args[0]);
        List<Double> ln = new LinkedList<Double>();
        MeanDesvEstan meanDesvEstan = new MeanDesvEstan(ln);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                double num = Double.parseDouble(line);
                ln.add(num);
            }
            meanDesvEstan.printDesvEstandar(ln);
            meanDesvEstan.printMean(ln);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }




}

