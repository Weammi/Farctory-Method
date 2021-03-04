package Factory;

public class MidTango implements TangoFactory{
    @Override
    public Tango createTango() {
        return new Mid();
    }
}
