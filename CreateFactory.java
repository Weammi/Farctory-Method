package Factory;

public class CreateFactory extends TangoFactory {

    public CreateFactory(int tango) {
        super(tango);
    }

    @Override
    Tango createTango() {
        if(tango==1)
            return new Mid();
        if(tango==0)
            return  new Carry();
        throw new IllegalArgumentException();
    }
}
