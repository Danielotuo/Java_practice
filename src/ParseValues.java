public class ParseValues {
    public static void main(String[] args) {
        String numberAsString = "2019.409";
        System.out.println(numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        System.out.println(numberAsString);

        number += 1;
        System.out.println("number = " + number);
    }
}
