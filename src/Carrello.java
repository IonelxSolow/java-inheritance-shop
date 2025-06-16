import java.util.Scanner;
import java.math.BigDecimal;

public class Carrello {


    public static void main(String[] args){
        Prodotto[] prodotti = new Prodotto[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < prodotti.length; i++){
            System.out.println("Nome del prodotto: ");
            String nomeProdotto = scan.nextLine();

            System.out.println("Marca del prodotto: ");
            String marcaProdotto = scan.nextLine();

            System.out.println("Prezzo (senza iva) : ");

            int prezzoProdotto = Integer.parseInt(scan.nextLine());

            System.out.println("Di quale categoria fa parte? tv, smartphone, cuffie");

            String productCategoryString = scan.nextLine();
            System.out.println(productCategoryString);

            switch (productCategoryString.toLowerCase().trim()){
                case "tv":
                    System.out.println("Dimensioni della TV in pollici : ");

                    int tvSize = Integer.parseInt(scan.nextLine());

                    System.out.println("Smart TV? (inserisci TRUE o FALSE)");

                    boolean isSmartTv = Boolean.parseBoolean(scan.nextLine().toLowerCase().trim());

                    Televisori tv = new Televisori(nomeProdotto, marcaProdotto, new BigDecimal(prezzoProdotto), tvSize, isSmartTv);
                    prodotti[i] = tv;

                    break;

                case "smartphone":
                    System.out.println("Gigabyte di memoria : ");

                    int giga = Integer.parseInt(scan.nextLine());

                    System.out.println("Codice IMEI : ");
                    String codiceIMEI = scan.nextLine();

                    Smartphone cellulare = new Smartphone(nomeProdotto, marcaProdotto, new BigDecimal(prezzoProdotto), codiceIMEI, giga);
                    prodotti[i] = cellulare;

                    break;
                
                case "cuffie":
                    System.out.println("Colore delle cuffie : ");

                    String coloreCuffie = scan.nextLine();

                    System.out.println("Sono Wireless? (Inserisci TRUE o FALSE)");

                    boolean isWireless = Boolean.parseBoolean(scan.nextLine());

                    Cuffie cuffie = new Cuffie(nomeProdotto, marcaProdotto, new BigDecimal(prezzoProdotto), coloreCuffie, isWireless);
                    prodotti[i] = cuffie;

                    break;
                
            }

            System.out.println("----------------");
        }

        scan.close();

        System.out.println("Ecco il tuo carrello: ");

        for (int i = 0; i < prodotti.length; i++){
            System.out.println(prodotti[i]);
            System.out.println("----------------");
        }
    }

}
 