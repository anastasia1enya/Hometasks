package home.com.Lesson10;

public class MathExample {

    public static void main(String[] args) {
        Sqrt sq = new Sqrt(1,12,36);
        System.out.println(sq.count());

    }
}

class Sqrt{

    private int a;
    private int b;
    private int c;
    private double x1;
    private double x2;
    private String res;

    Sqrt(int a,int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    public String count(){

        double d = Math.pow(b,2) - 4*(a*c);

        if (d<0){

            res = "No x " + null;
            return res;

        } if (d>0){

            x1 =  (-b+Math.sqrt(d))/(2*a);
            x2 = (-b-Math.sqrt(d))/(2*a);
            res = "x1 =" + x1 + " "+"x2 =" + x2;
        } else {
            x1 = (-b+Math.sqrt(d))/(2*a);
            res = "x1 =" + x1;
        }

        return res;
    }


}
