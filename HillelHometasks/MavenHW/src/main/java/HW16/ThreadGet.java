package HW16;

import static HW16.Count.getCount;
import static HW16.Count.setCount;

public class ThreadGet extends Thread {

    private int sum;

    ThreadGet(int sum, String name) {
        super(name);
        this.sum = sum;
    }

    @Override
    public void run() {

        while (getCount() != 0 && sum <= getCount()){

            setCount(getCount() - sum);
            System.out.println(Thread.currentThread().getName() + "--" + "You get " + sum + " usd on your balance  ");
            System.out.println("current count: "+getCount());
        }
        System.out.println("you have no money: " +getCount());
    }
}


