import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println();

        Smartphone smartphone1 = new Smartphone("Iphone 113", "Apple", new BigDecimal("1300"), new BigDecimal("22"), "123456789012345", 64);
        Smartphone smartphone2 = new Smartphone("Iphone 213", "Appleeee", new BigDecimal("1800"), new BigDecimal("21"), "901234512345678", 46);

        System.out.println("Smartphone1: " + smartphone1.getNome() + ", IMEI: " + smartphone1.getCodiceIMEI()
                + ", Codice prodotto: " + smartphone1.getCodice());
        System.out.println("Smartphone2: " + smartphone2.getNome() + ", IMEI: " + smartphone2.getCodiceIMEI()
                + ", Codice prodotto: " + smartphone2.getCodice());

        // test Setter Smartphone        
        smartphone1.setNome("Iphone 13 Pro");
        smartphone1.setMarca("Apple Inc.");
        smartphone1.setPrezzo(new BigDecimal("1400"));
        smartphone1.setIva(new BigDecimal("20"));
        smartphone1.setCodiceIMEI("999999999999999");
        smartphone1.setMemoria(128);

        System.out.println();
        System.out.println("Dopo Setter:");
        System.out.println();

        // test getter Smartphone
        System.out.println(smartphone1.getNome());
        System.out.println(smartphone1.getMarca());
        System.out.println(smartphone1.getPrezzo());
        System.out.println(smartphone1.getIva());
        System.out.println(smartphone1.getCodice());
        System.out.println(smartphone1.getCodiceIMEI());
        System.out.println(smartphone1.getMemoria());
        
        System.out.println();

        Televisori televisore1 = new Televisori("Samsung", "Topo di gamma", new BigDecimal("1800"), new BigDecimal("23"), 55, true);
      
        System.out.println("Televisore: " + televisore1.getNome() + ", Smart: " + televisore1.isSmart());

        System.out.println();

        Cuffie cuffie = new Cuffie("Songna", "Sony", new BigDecimal(120), new BigDecimal(25), "Blu", false);

        System.out.println("Cufie: " + cuffie.getNome() + ", Codice: " + cuffie.getCodice() + ", " + cuffie.getColor() + ", Wireless: " + cuffie.isWireless());

        System.out.println();
      

        

        

    }
}
