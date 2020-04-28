import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomItemFromArrayList {
    public static void main(String[] args) {
        /*
        Prompt the user for a few random subjects, verbs, and objects.
        Then pull a random one of each out to generate random sentences.
         */
        Scanner scn = new Scanner(System.in);
        Random r = new Random();
        int i;
        String user_input;
        ArrayList<String> subject = new ArrayList<>();
        ArrayList<String> verb = new ArrayList<>();
        ArrayList<String> object = new ArrayList<>();

        System.out.println("You will be assisting with generating random sentences.\nYou will be entering 5 subjects, 5 verbs, and then 5 objects.");
        System.out.println("Now please enter 5 subjects");
        for (i=0; i<5; i++){
            user_input = scn.nextLine();
            subject.add(user_input);
        }
        System.out.println("Now enter 5 verbs");
        for (i=0; i<5; i++) {
            user_input = scn.nextLine();
            verb.add(user_input);
        }
        System.out.println("Now enter 5 objects");
        for (i=0; i<5; i++) {
            user_input = scn.nextLine();
            object.add(user_input);
        }
        System.out.println("Enter 'g' to generate a sentence");
        user_input = scn.nextLine();
        if (user_input.compareToIgnoreCase("g")==0) {
            String random_subject = subject.get(r.nextInt(5));
            String random_verb = verb.get(r.nextInt(5));
            String random_object = object.get(r.nextInt(5));

            System.out.println(random_subject+" "+random_verb+" "+random_object);
        }
        System.out.println(subject);
        System.out.println(verb);
        System.out.println(object);
    }
}
