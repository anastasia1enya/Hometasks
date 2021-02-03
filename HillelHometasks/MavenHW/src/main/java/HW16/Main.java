package HW16;

public class Main {
    public static void main(String[] args) {

ThreadGet g = new ThreadGet(200,"Get th");
ThreadPut p = new ThreadPut(500,"Put th");



g.start();
p.start();

    }
}
