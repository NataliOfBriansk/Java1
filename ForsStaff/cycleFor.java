package ForsStaff;

public class cycleFor {
    public static void main(String[] args){
        boolean f;
        for(int a = 1, b = 100, i = b; i != 0; --i){
            f = getMultiple(i);
            if(f == true){
                System.out.print(i + " ");
            }
        }

    }

    public static boolean getMultiple(int y){
        int p = y % 4;
        boolean multiple;
        if (p == 0) {
            multiple = true;
        } else {
            multiple = false;
        }
        return (boolean) multiple;
        }
    }
