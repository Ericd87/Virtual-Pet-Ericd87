package virtual_pet;

public class VirtualPet {

    private String petName = "Ed";
    private String petDescription = "Swim";
    private String petType1 = "Sea Turtle";
    private String petType2 = "Green Turtle";
    private String petType3 = "Snapping Turtle";
    private String petType4 = "Galapagos Giant";
    private int petHunger;
    private int petThirst;
    private int petBoredom;
    private int petHappiness;
    private int petTiredness;
    private int petPlay;
    private int petPace;
    private int petSwim;

    public VirtualPet() {

    }

    public VirtualPet(String petType1sea_turtle, String petType2green_turtle, String petType3snapping_turtle, String petType4galapagos_giant_turtle) {
    }


    public String getPetName(String ed) { return petName; }

    public String getPetDescription() { return petDescription; }

    public String getPetType1(String sea_turtle) { return petType1; }

    public String getPetType2(String green_turtle) { return petType2; }

    public String getPetType3(String snapping_turtle) { return petType3; }

    public String getPetType4(String galapagos_giant_turtle) { return petType4; }

    public int getPetHunger() { return petHunger; }

    public int getPetThirst() { return petThirst; }

    public int getPetBoredom() { return petBoredom; }

    public int getPetHappiness() { return petBoredom; }

    public int getPetTiredness() { return petTiredness; }

    public int getPetPlay() { return petPlay; }

    public int getPetPace() { return petPace; }

    public int getPetSwim() { return petSwim; }

    //Constructor
    public VirtualPet(String petName, String petDescription, String petType1, String petType2, String petType3, String petType4, int petHunger, int petThirst, int petBoredom, int petHappiness, int petTiredness, int petPlay, int petPace, int petSwim) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petType1 = petType1;
        this.petType2 = petType2;
        this.petType3 = petType3;
        this. petType4 = petType4;
        this.petHunger = petHunger;
        this.petThirst = petThirst;
        this.petBoredom = petBoredom;
        this.petHappiness = petHappiness;
        this.petTiredness = petTiredness;
        this.petPlay = petPlay;
        this.petPace = petPace;
        this.petSwim = petSwim;
    }

    public boolean VirtualPet(int userEnteredNumber) {
        if (!(userEnteredNumber <= accessGame(1))) {

        } else {

        }
        this.petName = "Ed";
        this.petType1 = "Sea Turtle";
        this.petType2 = "Green Turtle";
        this.petType3 = "Snapping Turtle";
        this.petType4 = "Galapagos Giant Turtle";
        this.petHunger = 5;
        this.petThirst = 8;
        this.petBoredom = 6;
        this.petHappiness = 9;
        this.petTiredness = 4;
        this.petPlay = 10;
        this.petPace = 2;
        this.petSwim = 10;
        return true;

    }

    private int accessGame(int i) {
        return 0;
    }




    public boolean accessGame() {
        return true;
    }

    public void add(VirtualPet pet1) {
    }
}

    

































