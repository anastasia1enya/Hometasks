package HW16;

public class TreadPut extends Thread {

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

    public TreadPut(String name){
        super(name);
    }

    @Override
    public void run() {

while (totalSum!=0){
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTotalSum(getTotalSum()+sum);
        System.out.println( Thread.currentThread().getName() + "You put " + sum + " usd on your balance  ");
    }
        System.out.println("0 money");
    }



}
