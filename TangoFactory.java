package Factory;

abstract class TangoFactory {
    int tango;

    public TangoFactory(int tango) {
        this.tango = tango;
    }

    abstract Tango createTango();
}
