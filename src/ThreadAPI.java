public class ThreadAPI {
    public static void main(String[] args) {
        FinishBar finishBar = new FinishBar();
        FinishBarTest finishBarTest = new FinishBarTest();
        finishBar.start();
        finishBarTest.start();
    }
}