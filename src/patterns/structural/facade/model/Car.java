package patterns.structural.facade.model;

public class Car {

    private Conditioner conditioner;
    private Engine engine;
    private Radio radio;

    public Car() {
        this.conditioner = new Conditioner(true);
        this.engine = new Engine(false);
        this.radio = new Radio(true, "New wave");
    }

    public void start(){
        conditioner.switchConditioner();
        engine.switchEngine();
        radio.switchRadio();
    }
}
