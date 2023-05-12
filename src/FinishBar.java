public class FinishBar extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Finished. Thread name: " + this.getName());
    }
}
