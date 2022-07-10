package patterns.structural.facade.model;

public class Conditioner {

    private boolean isActive;

    public Conditioner(boolean isActive) {
        this.isActive = isActive;
    }

    public void switchConditioner(){
        if (isActive){
            System.out.println("Conditioner is working.");
        }
        else System.out.println("Conditioner isn't working.");
    }
}
