package HW16;

public class TreadGet extends Thread {


    TreadGet(String name, int totalSum) {
        super(name);
        this.totalSum=totalSum;
    }

    private int totalSum ;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private int sum ;


    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }


    @Override
    public void run() {


        while (totalSum != 0)  {
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setTotalSum(getTotalSum() - sum);

            System.out.println(Thread.currentThread().getName()+ "--" + "You get " + sum + " usd from your balance  ");
            System.out.println(totalSum);

        }
        System.out.println("0 money");


    }


}
