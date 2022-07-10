package patterns.structural.facade.model;

public class Radio {

    private boolean isActive;
    private String nameOfRadioStation;

    public Radio(boolean isActive, String nameOfRadioStation) {
        this.isActive = isActive;
        this.nameOfRadioStation = nameOfRadioStation;
    }

    public void switchRadio() {
        if (isActive){
            System.out.println("Radio is working. Wave: " + nameOfRadioStation);
        }
        else System.out.println("Radio isn't working.");
    }
}
