import java.util.concurrent.*;

public class SingleThread {
    public static void main(String[] args) {
        int corePoolSize = 5;
        int maximumPoolSize = 10;
        int queueCapacity = 100;
//        ExecutorService executor = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, 10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(queueCapacity));
        for (int i = 0; i < 1000; i++) {
            try {
                executor.execute(new RequestHandle("request-"+i));
                Thread.sleep(50);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        executor.shutdown();
        while (!executor.isTerminated()){

        }
    }
}
