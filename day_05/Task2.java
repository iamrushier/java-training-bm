
public class Task2 {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Thread is running using Lambda!");
        };

        Thread th = new Thread(task);
        th.start();
    }
}

// Result
// Thread is running
