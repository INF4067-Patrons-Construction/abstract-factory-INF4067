package construction.abstractFactory;

public class Client {
    public static void main(String[] args){
        AbstractFactory FactoryElectrique = new FactoryElectrique();
        AbstractFactory FactoryEssence = new FactoryEssence();

        Scooter scooter = null;
        Automobile automobile = null;

        System.out.println("utilisation de la premiere fabrique");
        scooter = FactoryElectrique.getScooter();
        automobile = FactoryElectrique.getAutomobile();
        scooter.methodScooter();
        automobile.methodAutomobile();

        System.out.println("utilisation de la deuxieme fabrique");
        scooter = FactoryEssence.getScooter();
        automobile = FactoryEssence.getAutomobile();
        scooter.methodScooter();
        automobile.methodAutomobile();
    }
}
