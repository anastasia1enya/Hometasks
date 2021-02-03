package HW16;

import static HW16.Count.getCount;
import static HW16.Count.setCount;

public class Get extends Thread {

    private int sum;

    Get(int sum, String name) {
        super(name);
        this.sum = sum;
    }

    @Override
    public void run() {

        for (int i = 0; i < 30; i++) {

//            if (getCount() != 0 && sum <= getCount()) {
//                System.out.println(i);
//                System.out.println("Prev " + getCount());
//                setCount(getCount() - sum);
//                System.out.println(Thread.currentThread().getName() + "--" + "You get " + sum + " usd on your balance  ");
//                System.out.println(getCount());
//
//                try {
//                    Thread.sleep(233);
//
//                    setCount(getCount() - sum);
//                    System.out.println();
//                    System.out.println(Thread.currentThread().getName() + "--" + "You get " + sum + " usd on your balance  ");
//                    System.out.println(getCount());
//                } catch (InterruptedException e) {
//                    System.out.println("programm finish");
//                    break;
//                }
//            } else {
//                System.out.println("you have no money");
//                break;
//            }
        }
    }
}


