package esercizio3;

public class ProvaConto {
    public static void main(String[] args) {
ContoCorrente conto = new ContoCorrente("Luca" , 200);
try {
    conto.preleva(300);

}catch (BancaException e){

    System.out.println(e.getMessage());
}

    }
}
