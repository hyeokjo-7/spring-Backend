package Head09_;

public class Outer {
    private int instanceValue = 200;

    public class Inner {
        public void printinstanceValue() {
            System.out.println("Outer instanceValue: " + instanceValue);
        }
    }
}