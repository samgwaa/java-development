public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        int sum = 0;
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); // pauses for 1 second
        }
        System.out.println("Launch");
    }
}
