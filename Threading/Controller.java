public class Controller
{
    public Controller()
    {
        
    }

    public static void start() {
        ThreadPing t1 = new ThreadPing();
        t1.start();
        ThreadPong t2 = new ThreadPong();
        t2.start();
    }
}
