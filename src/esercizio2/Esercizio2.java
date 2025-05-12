package esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("inserisci i km percorsi");
//            int km = scanner.nextInt();
//            System.out.println("inserisci i litri consumati");
//            int l= scanner.nextInt();
//            int consumo = km/l;
//            System.out.println("il consumo totale è " + consumo);
//        }catch (ArithmeticException e){
//            System.out.println("u can't " + e.getMessage());
//        }
        try {
            System.out.println("inserisci i km percorsi");
           double km = scanner.nextDouble();
            System.out.println("inserisci i litri consumati");
            double l= scanner.nextDouble();
            if(l!=0){
                double consumo = km/l;
                System.out.println("il consumo totale è " + consumo);
            }else{
                System.out.println("non puoi dividere per 0 un numero double altrimenti ottieni infito");
            }


        }catch (InputMismatchException e){
            System.out.println("u can't ");
        }

    }
}
