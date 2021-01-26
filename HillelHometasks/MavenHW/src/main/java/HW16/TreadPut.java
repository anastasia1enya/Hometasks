package HW16;

public class TreadPut extends Thread {

    TreadPut(String name, int totalSum) {
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

while (totalSum < 10_500){
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setTotalSum(getTotalSum()+sum);

        System.out.println( Thread.currentThread().getName()+ "--" + "You put " + sum + " usd on your balance  ");
    System.out.println(totalSum);
    }
        System.out.println("Limit is full");
    }



}
