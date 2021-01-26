package HW16;

public class Main {
    public static void main(String[] args) {

        int totalSum = 1000;
        int putSum = 30;
        int getSum = 30;

        TreadGet t = new TreadGet("GetThread",totalSum);
        TreadPut d = new TreadPut("PutThread",t.getTotalSum());

        d.setSum(30);
        t.setSum(50);
        System.out.println(t.getTotalSum());
        d.start();
        t.start();



    }
}
