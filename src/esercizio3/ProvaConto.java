package esercizio3;

public class ProvaConto {
    public static void main(String[] args) {
ContoCorrente conto = new ContoCorrente("Luca" , 200);
//try {
//    conto.preleva(300);
//
//}catch (BancaException e){
//
//    System.out.println(e.getMessage());
//}
ContoOnLine contoOn = new ContoOnLine("Luca", 22000 , 20000 );
try {
    contoOn.preleva(21000);
}catch (BancaException e){
    System.out.println("il prelievo non è disponibile");
}

    }
}
