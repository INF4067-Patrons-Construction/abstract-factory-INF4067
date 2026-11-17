package construction.abstractFactory;

public class FactoryElectrique implements AbstractFactory {

    public Scooter getScooter(){
        return new ScooterElectrique();
    }

    @Override
    public Automobile getAutomobile() {
        return new AutomobileElectrique();
    }
}
