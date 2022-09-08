package ForsStaff;

public class LoopFor {
    public static void main(String[] args) {
        for (int a = 1, b = 100, i = b; i != 0; --i) {
            if (getMultiple(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean getMultiple(int y) {
        return y % 4 == 0;
    }
}
