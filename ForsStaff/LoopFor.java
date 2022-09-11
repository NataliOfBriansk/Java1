package ForsStaff;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 100; i != 0; --i) {
            if (getMultiple(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean getMultiple(int y) {
        return y % 4 == 0;
    }
}
