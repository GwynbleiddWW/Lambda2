package Lambda2;

public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();
        Worker.OnTaskErrorListener errorListener = System.out::println;
        Worker worker1 = new Worker(errorListener);
        worker1.error33();
    }
}
