package patterns.structural.proxy.model;

public class InternetProxy implements Internet{

    private String wifiName;
    private InternetImpl internet;

    public InternetProxy(String wifiName) {
        this.wifiName = wifiName;
    }

    @Override
    public void display() {
        if (internet == null){
            internet = new InternetImpl(wifiName);
        }
        internet.display();
    }
}
