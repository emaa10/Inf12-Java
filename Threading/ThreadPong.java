public class ThreadPong extends Thread
{
    public ThreadPong() {
        
    }
    
    public void run() {
        for(int i = 0; i<10; i++) {
            System.out.println("pong");
        }
    }
}
