package construction.abstractFactory;

public class FactoryElectrique implements AbstractFactory {

    public Scooter getScooter(){
        return new ScooterElectrique();
    }

    public Automobile getAutomobile() {
        return new AutomobileElectrique();
    }

    public Camion getCamion() {
        return new CamionElectrique();
    }
}
