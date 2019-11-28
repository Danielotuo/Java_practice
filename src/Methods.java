public class Methods {
    public static void main(String[] args) {

        calculatescore(true,6000, 5, 200);
    }

    public static int calculatescore(boolean Gameover, int score, int levelcompleted, int bonus){

        if (Gameover){
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("Your final score is: " + finalscore);
            return finalscore;
            }

        return -1;
    }
}
