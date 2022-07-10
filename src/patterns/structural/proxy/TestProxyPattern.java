package patterns.structural.proxy;

import patterns.structural.proxy.model.Internet;
import patterns.structural.proxy.model.InternetProxy;

public class TestProxyPattern {
    public static void main(String[] args) {

        Internet proxy = new InternetProxy("myWifi123");
        proxy.display();
    }
}
