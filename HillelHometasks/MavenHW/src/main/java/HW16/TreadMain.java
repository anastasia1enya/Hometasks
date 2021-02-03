package HW16;

import lombok.Getter;
import lombok.Setter;

public class TreadMain implements Runnable {

   @Getter
   @Setter
    private volatile int totalSum;

    public TreadMain(int totalSum) {
        this.totalSum = totalSum;
    }

    @Override
    public void run() {

    }
}
