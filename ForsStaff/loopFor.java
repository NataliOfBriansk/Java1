package ForsStaff;

public class loopFor {
    public static void main(String[] args) {
        boolean f;
        for (int a = 1, b = 100, i = b; i != 0; --i) {
            f = getMultiple(i);
            if (f) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean getMultiple(int y) {
        int multiple4 = y % 4;
        boolean multiple;
        multiple = multiple4 == 0;
        return multiple;
    }
}
