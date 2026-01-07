package Head09_;

public class MainTese {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printinstanceValue();
    }
}

