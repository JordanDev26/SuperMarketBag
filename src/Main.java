import org.jrescalante.supermarketbag.model.Clean;
import org.jrescalante.supermarketbag.model.Dairy;
import org.jrescalante.supermarketbag.model.SuperMarketBag;

public class Main {
    public static void main(String[] args) {
        SuperMarketBag<Clean> cleaningBag = new SuperMarketBag<>();
        cleaningBag.addProduct(new Clean("Escoba",100.0,"Palo, Escoba",0))
                .addProduct(new Clean("Fabuloso",100.0,"Quimico, fresa",2))
                .addProduct(new Clean("Escoba",100.0,"Palo, Escoba",0))
                .addProduct(new Clean("Fabuloso",100.0,"Quimico, fresa",2));

        for (Clean c: cleaningBag){
            System.out.println(c.getName());
            System.out.println(c.getPrice());
            System.out.println(c.getComponents());
            System.out.println(c.getLiters());
        }

        SuperMarketBag<Dairy> dairyBag = new SuperMarketBag<>();
        dairyBag.addProduct(new Dairy("Milk",200.0,5,7));
        dairyBag.addProduct(new Dairy("Yogurt",200.0,5,7));
        dairyBag.addProduct(new Dairy("Protein",200.0,5,7));
        dairyBag.addProduct(new Dairy("Trembo",200.0,5,7));

        for (Dairy dairy: dairyBag){
            System.out.println(dairy.getName());
            System.out.println(dairy.getPrice());
            System.out.println(dairy.getAmount());
            System.out.println(dairy.getProtein());
        }

    }
}