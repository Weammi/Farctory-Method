package Factory;

public class CarryTango implements TangoFactory{
    @Override
    public Tango createTango() {
        return new Carry();
    }
}
