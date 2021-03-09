package Factory;

public class CreateFactory {


    Tango giveTango(int tango) {
        if(tango==1)
            return new Mid();
        if(tango==0)
            return  new Carry();
        throw new IllegalArgumentException();
    }
}
