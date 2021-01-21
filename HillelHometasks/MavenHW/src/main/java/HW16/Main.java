package HW16;

public class Main {
    public static void main(String[] args) {
        TreadTh d = new TreadTh("1 Thread","sum");
        TreadTh b = new TreadTh("2 Thread","sum");

        d.start();
        b.start();

        d.setSum(0);

        d.put(50);
        d.put(50);
        d.put(150);
        b.put(50);
        d.put(50);
        d.put(50);
        d.put(50);
        d.put(50);

        d.get(100);
        b.get(100);
        b.get(88);
        b.get(100);
        b.get(50);
        b.get(99);
    }
}
