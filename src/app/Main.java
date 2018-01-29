package app;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File ("story.txt");
        Scanner scan = new Scanner(file);
        Scanner input = new Scanner(System.in);
        String story = "";
        String storyM = "";
        String adjective;
        String noun;
        String place;
        String Animal;
        String exclamation;
        String articleofclothing;
        String twoAdjective;
        String threeAdjective;
        String Story;
        String propernoun;
        String jobtitle;
        String celebrity;


        System.out.println("Do you want a 'Myles' or 'Niko' Story?");
        Story = input.nextLine();


            if (Story.equals("Niko")){
                story = scan.nextLine();
                System.out.println("Enter an Adjective");
                adjective = input.nextLine();

                System.out.println("Enter a noun");
                noun = input.nextLine();

                System.out.println("Enter an Exclamation");
                exclamation = input.nextLine();

                System.out.println("Enter a place");
                place = input.nextLine();

                System.out.println("Enter an Article of Clothing");
                articleofclothing = input.nextLine();

                System.out.println("Enter an Adjective");
                twoAdjective = input.nextLine();

                System.out.println("Enter an Animal");
                Animal = input.nextLine();

                System.out.println("Enter an Adjective");
                threeAdjective = input.nextLine();
                 //ok i guess you could say that
                 story = story.replaceFirst("____", adjective);
                 story = story.replaceFirst("____", noun);
                 story = story.replaceFirst("____", exclamation);
                 story = story.replaceFirst("____", noun);
                 story = story.replaceFirst("____", place);
                 story = story.replaceFirst("____", articleofclothing);
                 story = story.replaceFirst("____", articleofclothing);
                 story = story.replaceFirst("____", twoAdjective);
                 story = story.replaceFirst("____", Animal);
                 story = story.replaceFirst("____", threeAdjective);
                 System.out.println(story);
                }

             else if (Story.equals("Myles")){
                storyM = scan.nextLine();
                 System.out.println("Enter a Proper Noun");
                 propernoun = input.nextLine();

                 System.out.println("Enter a noun");
                 noun = input.nextLine();

                 System.out.println("Enter an Job Title");
                 jobtitle = input.nextLine();

                 System.out.println("Enter a Place");
                 place = input.nextLine();

                 System.out.println("Enter a Celebrity");
                 celebrity = input.nextLine();

                 System.out.println("Enter an Adjective");
                 twoAdjective = input.nextLine();

                 System.out.println("Enter an Animal");
                 Animal = input.nextLine();

                 System.out.println("Enter an Adjective");
                 threeAdjective = input.nextLine();
                 //ok i guess you could say that
                 storyM = storyM.replaceFirst("____", propernoun);
                 storyM = storyM.replaceFirst("____", noun);
                 storyM = storyM.replaceFirst("____", jobtitle);
                 storyM = storyM.replaceFirst("____", place);
                 storyM = storyM.replaceFirst("____", celebrity);
                 storyM = storyM.replaceFirst("____", twoAdjective);
                 storyM = storyM.replaceFirst("____", propernoun);
                 System.out.println(storyM);
            }
            else{
            System.out.println("Excuse me Ma'am please type within my guidlines.");
        }




    }
}
