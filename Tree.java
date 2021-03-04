package Factory;

public class Tree {
    public static void main(String[] args) {
        TangoFactory tangoFactory = new MidTango();
        Tango tango = tangoFactory.createTango();
        tango.showTango();
    }
}
