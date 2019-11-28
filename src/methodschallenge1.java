public class methodschallenge1 {
    public static void main(String[] args) {

        int position = chsp(600);
        dhsp("Dan", position);

        position = chsp(900);
        dhsp("Joe", position) ;

        position = chsp(400);
        dhsp("Jnr", position);

        position = chsp(50);
        dhsp("Darl", position);

    }

    public static void dhsp(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table." );

    }

    public static int chsp(int score) {
        if(score >= 1000){
            return 1;}
        else if(score >= 500 && score < 1000){
            return 2;}
        else if(score >= 100 && score < 500){
            return 3;}

        return 4;

 /*       int position = 4; //assuming position 4 will be returned
        if(score >= 1000){
            position = 1;}
        else if(score >= 500){
            position = 2;}
        else if(score >= 100);{
            position = 3;}
        return position;*/

    }
}
