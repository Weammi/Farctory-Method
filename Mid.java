package Factory;

import java.util.ArrayList;

public class Mid implements Tango{
    ArrayList<Integer> nubmerArray = new ArrayList<>();
    @Override
    public void showTango(int nubmer) {
    nubmerArray.add(nubmer);
    System.out.println(nubmerArray);
    }
}
