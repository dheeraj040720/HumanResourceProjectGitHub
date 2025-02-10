               
public class Pattern {
    public static void main(String args[]) {

        for (int i = 0; i < 10; i += 2) {    //  i=0   0< 10   
            for (int j = 2 * (10 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {  // 0=0
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}