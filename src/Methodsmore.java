public class Methodsmore {
    public static void main(String[] args) {

        int highscore = calculatescore(true,1000, 5, 200);
        System.out.println("Your high score is: " + highscore);
    }

    public static int calculatescore(boolean Gameover, int score, int levelcompleted, int bonus){

        if (Gameover){
            int finalscore = score + (levelcompleted * bonus);
            return finalscore;
        }

        return -1;
    }
}
