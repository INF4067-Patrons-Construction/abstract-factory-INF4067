package construction.abstractFactory;

public class Client {
    public static void main(String[] args){
        AbstractFactory FactoryElectrique = new FactoryElectrique();
        AbstractFactory FactoryEssence = new FactoryEssence();
        AbstractFactory FactoryHybride = new FactoryHybride();

        Scooter scooter = null;
        Automobile automobile = null;
        Camion camion = null;

        System.out.println("utilisation de la premiere fabrique");
        scooter = FactoryElectrique.getScooter();
        automobile = FactoryElectrique.getAutomobile();
        camion = FactoryHybride.getCamion();
        scooter.methodScooter();
        automobile.methodAutomobile();
        camion.methodCamion();

        System.out.println("utilisation de la deuxieme fabrique");
        scooter = FactoryEssence.getScooter();
        automobile = FactoryEssence.getAutomobile();
        camion = FactoryHybride.getCamion();
        scooter.methodScooter();
        automobile.methodAutomobile();
        camion.methodCamion();

        System.out.println("utilisation de la troisieme fabrique");
        scooter = FactoryEssence.getScooter();
        automobile = FactoryEssence.getAutomobile();
        camion = FactoryHybride.getCamion();
        scooter.methodScooter();
        automobile.methodAutomobile();
        camion.methodCamion();
    }
}
