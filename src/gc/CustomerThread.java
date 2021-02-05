package gc;

public class CustomerThread implements Runnable {

    public void run(){
        for(int i = 0; i < 10; i++)
        {
            CustomerManager.addCustomer();
        }

        System.out.println("List size is : "+CustomerManager.getCount());
    }
}
