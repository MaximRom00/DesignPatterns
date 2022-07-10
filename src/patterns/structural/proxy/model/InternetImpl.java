package patterns.structural.proxy.model;

public class InternetImpl implements Internet{

    private String wifiName;

    public InternetImpl(String wifiName) {
        this.wifiName = wifiName;
        getConnect(wifiName);
    }

    @Override
    public void display() {
          System.out.println("Internet is working, using wifi: " + wifiName);

    }

    public void getConnect(String wifiName) {
        System.out.println("Get internet connection by: " + wifiName);
    }
}
