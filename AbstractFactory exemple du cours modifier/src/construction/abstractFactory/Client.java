package construction.abstractFactory;

public class Client {

    public static void main(String[] args) {

        IProduitFactory produitFactory1 =
                new ProduitFactory1();

        IProduitFactory produitFactory2 =
                new ProduitFactory2();

        ProduitA produitA;
        ProduitB produitB;
        ProduitC produitC;

        System.out.println("Utilisation de la premiere fabrique");

        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitC = produitFactory1.getProduitC();

        produitA.methodA();
        produitB.methodeB();
        produitC.methodC();

        System.out.println("\nUtilisation de la seconde fabrique");

        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitC = produitFactory2.getProduitC();


        produitA.methodA();
        produitB.methodeB();
        produitC.methodC();
    }
}