package construction.abstractFactory;

public class FactoryEssence implements AbstractFactory {

    public Scooter getScooter(){
        return new ScooterEssence();
    }

    public Automobile getAutomobile() {
        return new AutomobileEssence();
    }

    public Camion getCamion() {
        return new CamionEssence();
    }
}
