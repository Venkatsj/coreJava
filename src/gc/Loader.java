package gc;

public class Loader {

    public static void main (String[] args){


        for(int i = 0; i < 100000; i++){
            CustomerThread ct = new CustomerThread();
            Thread t = new Thread(ct);
            t.start();
        }


    }

}
