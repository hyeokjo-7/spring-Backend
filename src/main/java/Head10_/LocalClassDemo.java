package Head10_;

public class LocalClassDemo {
    public void executeTesk() {
         int taskId = 0506;

        class LocalWoker {
            public void run() {
              System.out.println("LocalWoker started with taskId =" + taskId);
            }
        }
//       int taskId = 001

        LocalWoker woker = new LocalWoker();
        woker.run();
    }
    public static void main(String[] args) {
        LocalClassDemo demo = new LocalClassDemo();
        demo.executeTesk();
    }
}
