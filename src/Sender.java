public class Sender {
    public void send (String msg) {
        System.out.println("Printing: " + msg);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(msg + "   .. printed");
    }
}
