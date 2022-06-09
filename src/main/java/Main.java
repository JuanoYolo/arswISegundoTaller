import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File(args[0]);
        List<Integer> ln = new LinkedList<Integer>();
        MediaAritmetica mediaAritmetica = new MediaAritmetica(ln);
        DesvEstandar desvEstandar = new DesvEstandar(ln);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            int cont = 0;
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                int num = Integer.parseInt(line);
                ln.add(num);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }




}

