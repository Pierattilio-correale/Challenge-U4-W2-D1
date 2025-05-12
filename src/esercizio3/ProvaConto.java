package esercizio3;

import java.util.Scanner;

public class ProvaConto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
ContoCorrente conto = new ContoCorrente("Luca" , 200);
//try {
//    conto.preleva(300);
//
//}catch (BancaException e){
//
//    System.out.println(e.getMessage());
//}
//        System.out.println(conto.getnMovimenti());
ContoOnLine contoOn = new ContoOnLine("Luca", 22000 , 20000 );
//try {
//    contoOn.preleva(21000);
//}catch (BancaException e){
//    System.out.println("il prelievo non è disponibile");
//}
        while(true) {
            System.out.println("Dammi il valore del prelievo");
            int prelievo = scanner.nextInt();

            try {
                conto.preleva(prelievo);
            }catch (BancaException e){
                System.out.println(e.getMessage());
                break;
            }

        }

        while(true) {
            System.out.println("Dammi il valore del prelievo del conto online");
            int prelievo = scanner.nextInt();

            try {
                contoOn.preleva(prelievo);
            }catch (BancaException e){
                System.out.println(e.getMessage());
                break;
            }

        }
    }
}