public class RequestHandle implements Runnable{
    String name;

    public RequestHandle(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+ "starting process "+name);
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName()+ "finished process "+name);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
