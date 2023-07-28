package org.Dila1;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        // Check if the user knows what an adjective is
        System.out.print("Do you know what an adjective is? (yes/no): ");
        String knowsAdjective = sc.nextLine().toLowerCase();

        String adjective;
        if (knowsAdjective.equals("no")) {
            System.out.println("An adjective is a word that describes a noun (a person, place, or thing).");
            System.out.println("For example, 'happy', 'big', 'beautiful', etc.");
            System.out.print("Now, please enter an adjective: ");
            adjective = sc.nextLine();
        } else {
            System.out.print("Enter an adjective: ");
            adjective = sc.nextLine();
        }

        // Check if the user knows what a noun is
        System.out.print("Do you know what a noun is? (yes/no): ");
        String knowsNoun = sc.nextLine().toLowerCase();

        String noun;
        if (knowsNoun.equals("no")) {
            System.out.println("A noun is a person, place, or thing.");
            System.out.println("For example, 'dog', 'house', 'car', etc.");
            System.out.print("Now, please enter a noun: ");
            noun = sc.nextLine();
        } else {
            System.out.print("Enter a noun: ");
            noun = sc.nextLine();
        }

        // Check if the user knows what a verb is
        System.out.print("Do you know what a verb is? (yes/no): ");
        String knowsVerb = sc.nextLine().toLowerCase();

        String verb;
        if (knowsVerb.equals("no")) {
            System.out.println("A verb is an action word that shows what someone or something is doing.");
            System.out.println("For example, 'run', 'jump', 'eat', etc.");
            System.out.print("Now, please enter a verb: ");
            verb = sc.nextLine();
        } else {
            System.out.print("Enter a verb: ");
            verb = sc.nextLine();
        }

        // Random element
        String[] randomElements = {"giant dragon", "enchanted forest", "magic potion", "time machine"};
        int randomIndex = (int) (Math.random() * randomElements.length);
        String randomElement = randomElements[randomIndex];

        // Mad Libs story
        String madLibsStory = "Once upon a time, there was a person named " + name +
                ". This " + adjective + " individual found a mysterious " + noun +
                " and decided to " + verb + " with it. \n Little did they know that this " + noun +
                " was actually a portal to a world of wonders! \n They were transported to an incredible realm with a " + randomElement +
                ". \n The adventure was unbelievable!";

        // Output the completed Mad Libs story
        System.out.println("\nHere's your Mad Libs story:\n" + madLibsStory);
    }
}