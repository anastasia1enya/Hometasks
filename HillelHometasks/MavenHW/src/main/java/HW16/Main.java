package HW16;

public class Main {
    public static void main(String[] args) {

        TreadGet t = new TreadGet("Get");
        TreadPut d = new TreadPut("Put");
        t.setTotalSum(1000);
        t.setSum(50);
        d.setTotalSum(1000);
        d.setSum(30);
        t.start();
        d.start();


    }
}
