public class ex1 {
    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(8);
        checkNumber(-6);



    }

    public static void checkNumber(int num) {

        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else if (num == 0) {
            System.out.println("equal to 0");
        }

    }
}
