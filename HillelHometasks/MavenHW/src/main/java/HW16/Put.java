package HW16;

import static HW16.Count.getCount;
import static HW16.Count.setCount;

public class Put extends Thread {

    private int sum;

    Put(int sum, String name) {
        super(name);
        this.sum = sum;
    }


    @Override
    public void run() {

        for (int i = 0; i < 30; i++) {

            if (getCount() < 5000 && sum + getCount() < 5000) {
//                System.out.println(i);
//                System.out.println("Prev " + getCount());
                setCount(getCount() + sum);
                System.out.println(Thread.currentThread().getName() + "--" + "You put " + sum + " usd on your balance  ");
                System.out.println(getCount());
//            try {
//                Thread.sleep(233);
//                setCount(getCount() + sum);
//                System.out.println(Thread.currentThread().getName() + "--" + "You put " + sum + " usd on your balance  ");
//                System.out.println(getCount());
//            } catch (InterruptedException e) {
//                System.out.println("programm finish");
//                break;}
            } else {
                System.out.println("limit is off");
                break;
            }
        }
    }

}
