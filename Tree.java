package Factory;

public class Tree {
    public static void main(String[] args) {
        CreateFactory createFactory = new CreateFactory();
        Tango tango = createFactory.giveTango(1);
        tango.showTango();
    }
}
