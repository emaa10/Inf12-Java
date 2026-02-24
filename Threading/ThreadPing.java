public class ThreadPing extends Thread
{
    public ThreadPing() {
        
    }
    
    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.println("ping");
        }
    }
}
