
public class Task2 {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Thread is running");
        };

        Thread th = new Thread(task);
        th.start();
    }
}

// Result
// Thread is running
