package HW16;

import static HW16.Count.getCount;
import static HW16.Count.setCount;

public class ThreadPut extends Thread {

    private int sum;

    ThreadPut(int sum, String name) {
        super(name);
        this.sum = sum;
    }


    @Override
    public void run() {


        while(getCount() < 5000 && sum + getCount() < 5000){
            setCount(getCount() + sum);
            System.out.println(Thread.currentThread().getName() + "--" + "You put " + sum + " usd on your balance  ");
            System.out.println("current count: "+getCount());

        }
        System.out.println("limit is off: " +getCount());



    }

}
