package myOwnLinkedList;

import linkedJavaList.MeanDesvEstan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CalculatorMyLinkedList {

    public static void main(String[] args) {
        File file = new File(args[0]);
        //MyLinkedList ln = new MyLinkedList<Double>();
        //MeanDesvEstanOther meanDesvEstanOther= new MeanDesvEstanOther(ln);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                double num = Double.parseDouble(line);
                //ln.add(num);
            }
            //meanDesvEstanOther.printDesvEstandar(ln);
           //meanDesvEstanOther.printMean(ln);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
