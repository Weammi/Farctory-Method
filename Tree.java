package Factory;

public class Tree {
    public static void main(String[] args) {
        TangoFactory tangoFactory = new CreateFactory(1);
        Tango tango = tangoFactory.createTango();
        tango.showTango();
    }
}
