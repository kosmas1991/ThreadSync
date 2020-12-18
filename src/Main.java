public class Main {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadSend T1 = new ThreadSend("Hello from public",snd);
        ThreadSend T2 = new ThreadSend("Hello again", snd);

        T1.start();
        T2.start();

//        try {
//            T1.join();
//            T2.join();
//        } catch (InterruptedException e) {
//            System.err.println("Interrupted");
//        }

    }
}
