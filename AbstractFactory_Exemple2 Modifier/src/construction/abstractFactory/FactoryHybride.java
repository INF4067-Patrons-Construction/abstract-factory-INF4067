package construction.abstractFactory;

public class FactoryHybride implements AbstractFactory {

    public Scooter getScooter(){
        return new ScooterHybride();
    }

    public Automobile getAutomobile() {
        return new AutomobileHybride();
    }

    public Camion getCamion() {
        return new CamionHybride();
    }
}
