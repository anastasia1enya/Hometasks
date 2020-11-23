package classroom.Other;

public class Box {

    private double w;
    private double h;
    private double d;

    public  Box (double w, double h,double d){
        this.w = w;
        this.h = h;
        this.d = d;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getD() {
        return d;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Box{" +
                "w=" + w +
                ", h=" + h +
                ", d=" + d +
                '}';
    }
}
