/**
 * Created by LordwolF on 8/4/2016.
 */


public class Machine implements Info {

    private  int id =  7;

    public void start() {
        System.out.println("Machine Started!!!!!");
    }

    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}
