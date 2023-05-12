public class ThreadAPI {
    public static void main(String[] args) {
        FinishBar finishBar = new FinishBar();
        FinishBar finishBarTest = new FinishBar();
        finishBar.start();
        finishBarTest.start();
    }
}