
package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

        Scanner input = new Scanner(System.in);

        VirtualPet myVirtualPet = new VirtualPet();

        VirtualPet petType1 = new VirtualPet("Sea Turtle");
        VirtualPet petType2 = new VirtualPet("Green Turtle");
        VirtualPet petType3 = new VirtualPet("Snapping Turtle");
        VirtualPet petType4 = new VirtualPet("Galapagos Giant Turtle");

        myVirtualPet.add(petType1);
        myVirtualPet.add(petType2);
        myVirtualPet.add(petType3);
        myVirtualPet.add(petType4);

        String userChoice;

        do {
            System.out.println("Welcome to Raising Ed The Turtle 2020");
            System.out.println("This interactive pet game is where you can raise your own turtle named Ed");
            System.out.println("You will now begin the game by selecting a turtle egg:");
            myVirtualPet.accessGame();

            System.out.println("You have 4 different species of turtles you can choose from:");
            System.out.println("Please choose one of the following eggs between 1 - 4 that you want from below");
            System.out.println("Press 1 to select Sea Turtle Egg");
            System.out.println("Press 2 to select Green Turtle Egg");
            System.out.println("Press 3 to select Snapping Turtle Egg");
            System.out.println("Press 4 to select Galapagos Giant Turtle Egg");
            userChoice = input.nextLine();

            System.out.println("Now that you have selected the following Egg, get ready to start the game! ");
            System.out.println("You will now be able to start the game with a baby turtle");

            if (userChoice.equals("1")) {
                System.out.println("You have selected the Sea Turtle");
                System.out.print("Here is your new Sea Turtle Ed");
                myVirtualPet.accessGame();

                if (userChoice.equals("2")) {
                    System.out.println("You have selected the Green Turtle");
                    System.out.println("Here is your Green Turtle Ed");
                    myVirtualPet.accessGame();

                    if (userChoice.equals("3")) {
                        System.out.println("You have selected the Snapping Turtle");
                        System.out.println("Here is your Snapping Turtle Ed");
                        myVirtualPet.accessGame();

                        if (userChoice.equals("4")) {
                            System.out.println("You have selected the Galapagos Giant Turtle");
                            System.out.println("Here is your Galapagos Giant Turtle Ed");
                            myVirtualPet.accessGame();

                            System.out.println("Enjoy your new Turtle have fun raising him");
                            System.out.println("Select 1 to feed Turtle Ed");
                            System.out.println("Select 2 for Turtle Ed to drink water");
                            System.out.println("Select 3 for Turtle Ed to play and not be bored!");
                            System.out.println("Select 4 to make Ed Happy");
                            System.out.println("Select 5 to make Ed got to Bed");
                            System.out.println("Select 6 to make Ed Play");
                            System.out.println("Select 7 for Ed to Race");
                            System.out.println("Select 8 for Ed to swim");


                        }

                    }
                }


            }


        }
    }
}