import java.util.Scanner;
public class StringManipss {
    public static void main (String[] args)
    {
        String phrase = new String ("This is a String test.");
        int phraseLength=phrase.length();
        String middle3=null;
        String city=null,state=null;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your hometown details:");
        System.out.println("City: ");
        city=scn.nextLine();
        System.out.println("State: ");
        state=scn.nextLine();
        city=city.toLowerCase();
        state=state.toUpperCase();

        int middleIndex = phraseLength / 2;
        char c1=phrase.charAt(middleIndex-1);
        char c2=phrase.charAt(middleIndex);
        char c3=phrase.charAt(middleIndex+1);
        middle3=c1+""+c2+""+c3;
        // get the substring for each half of the phrase
        String firstHalf = phrase.substring(0,middleIndex);
        String secondHalf = phrase.substring(middleIndex, phraseLength); // get middle 3 characters
        // concatenate the firstHalf at the end of the secondHalf
        String switchedPhrase = secondHalf.concat(firstHalf);


        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength + " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " + phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase.replace(" ","*"));
        System.out.println("middle3 : "+middle3);

        System.out.println(state+""+city+""+state);
        System.out.println();

    }
}