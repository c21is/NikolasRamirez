package app;

import java.io.File;
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) throws Exception {
        File file = new File("story.txt");
        Scanner scan = new Scanner(file);
        Scanner input = new Scanner(System.in);
        String Niko;
        String Myles;
        String Chris;
        String write;
        int randomNumber = (int) (Math.random()*3);

        System.out.println("Niko, Myles, or Chris?");
        write = input.nextLine();
        if (write.equals("Chris")) {
            if (randomNumber == 1)
                System.out.println("They picked Niko. You Lost");
            if (randomNumber == 2)
                System.out.println("They picked Myles. You Won");
            if (randomNumber == 3)
                System.out.println("They picked Chris. You Tied");
        }
        if (write.equals("Myles")) {
            if (randomNumber == 1)
                System.out.println("They picked Niko. You Won");
            if (randomNumber == 2)
                System.out.println("They picked Myles. You Tied");
            if (randomNumber == 3)
                System.out.println("They picked Chris. You Lost");
        }
        if (write.equals("Niko")) {
            if (randomNumber == 1)
                System.out.println("They picked Niko. You Tied");
            if (randomNumber == 2)
                System.out.println("They picked Myles. You Lost");
            if (randomNumber == 3)
                System.out.println("They picked Chris. You Won");
        }

        }

    }