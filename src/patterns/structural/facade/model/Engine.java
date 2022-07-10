package patterns.structural.facade.model;

public class Engine {
    private boolean isActive;

    public Engine(boolean isActive) {
        this.isActive = isActive;
    }

    public void switchEngine(){
        if (isActive){
            System.out.println("Engine is working.");
        }
        else System.out.println("Engine isn't working.");
    }
}
