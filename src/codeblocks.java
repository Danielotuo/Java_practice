public class codeblocks {
    public static void main(String[] args) {
        boolean Gameover = true;
        int score = 5000;
        int levelcompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score >1000) {
//            System.out.println("score is less than 5000 but greater than 1000");
//        }
//        else if(score < 1000){
//            System.out.println("score is less than 1000");
//        }
//        else{
//            System.out.println("got here");
//        }
        if (Gameover == true){
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("Your final score is: " + finalscore);
        }

    }
}
