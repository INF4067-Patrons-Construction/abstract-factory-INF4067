package construction.abstractFactory;

public class FactoryEssence implements AbstractFactory {

    public Scooter getScooter(){
        return new ScooterEssence();
    }

    @Override
    public Automobile getAutomobile() {
        return new AutomobileEssence();
    }
}
