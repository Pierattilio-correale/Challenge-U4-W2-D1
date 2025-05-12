package esercizio1;

import java.util.Arrays;
import java.util.Scanner;

;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int [] provaArray = new int[5];
       provaArray[0]= (int)Math.floor(Math.random()*10)+1;
        provaArray[1]= (int)Math.floor(Math.random()*10)+1;
        provaArray[2]= (int)Math.floor(Math.random()*10)+1;
        provaArray[3]= (int)Math.floor(Math.random()*10)+1;
        provaArray[4]= (int)Math.floor(Math.random()*10)+1;

        System.out.println(Arrays.toString(provaArray));

        int sceltaPosizione;

        while (true){
            System.out.println("inserisci valore della posizione da 1 a 5 per popolare l'array e 0 per visualizzarlo");
       sceltaPosizione = scanner.nextInt();
            switch (sceltaPosizione){
                case 1:
                    System.out.println("scegli il numero in posizione 0");
                provaArray[0]= scanner.nextInt();
                break;
                case 2:
                    System.out.println("scegli il numero in posizione 1");
                    provaArray[1]= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("scegli il numero in posizione 2");
                    provaArray[2]= scanner.nextInt();
                    break;
                case 4:
                    System.out.println("scegli il numero in posizione 3");
                    provaArray[3]= scanner.nextInt();
                    break;
                case 5:
                    System.out.println("scegli il numero in posizione 4");
                    provaArray[4]= scanner.nextInt();
                    break;
                case 0:
                    System.out.println("Grazie per aver scelto i nostri numeri");
                    break;
                default:
            }

            if(sceltaPosizione==0){
                break;
            }
            if(sceltaPosizione >= 6){

                try {

                    provaArray[5]= 22;
                }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("non è possibile inserire più di 5 elementi nell'array");
                }
            }

        }
        for (int i=0 ; i<provaArray.length; i++){
            System.out.print(provaArray[i]+" ");
        }


    }
}
