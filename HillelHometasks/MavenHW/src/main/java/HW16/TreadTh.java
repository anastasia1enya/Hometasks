package HW16;

public class TreadTh extends Thread {

    private int totalSum ;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    private int sum ;
    private String operation ;


    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public TreadTh(String name, String operation) {

        super(name);

    }

    @Override
    public void run() {


        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println( Thread.currentThread().getName() + " : RUNNABLE >> Run new thread ... ");


    }

    public int put (int sum){

        setTotalSum(getTotalSum()+sum);
        System.out.println("You put " + sum + " usd on your balance  ");

        return  totalSum;

    }
    public int get (int sum){

        setTotalSum(getTotalSum()-sum);
        System.out.println("You put " + sum + " usd on your balance  ");

        return  totalSum;

    }


}
