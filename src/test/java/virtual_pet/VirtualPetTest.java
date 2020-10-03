package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class VirtualPetTest {

VirtualPet turtleTest;
VirtualPet Turtle;


@BeforeEach
public void setup(){
    turtleTest = new VirtualPet();
}

@Test
public void shouldBeAbleToGetPetName(){
    VirtualPet turtleTest = new VirtualPet();
    String result;
    result = turtleTest.getPetName("Ed");
}

@Test
public void shouldBeAbleToGetPetType1() {
    VirtualPet turtleTest = new VirtualPet();
    String result;
    result = turtleTest.getPetType1("Sea Turtle");
    }

@Test
public void shouldBeAbleToGetPetType2() {
    VirtualPet turtleTest = new VirtualPet();
    String result;
    result = turtleTest.getPetType2("Green Turtle");
    }

@Test
public void shouldBeAbleToGetPetType3() {
    VirtualPet turtleTest = new VirtualPet();
    String result;
    result = turtleTest.getPetType3("Snapping Turtle");
    }


@Test
public void shouldBeAbleToGetPetType4() {
        VirtualPet turtleTest = new VirtualPet();
        String result;
        result = turtleTest.getPetType4("Galapagos Giant Turtle");
    }

@Test
public void getPetHunger() {
    VirtualPet turtleTest = new VirtualPet();
    int petHunger = turtleTest.getPetHunger();
    }

@Test
public void getPetThirst() {
    VirtualPet turtleTest = new VirtualPet();
    int petThirst = turtleTest.getPetThirst();
    }

@Test
public void getPetBoredom() {
    VirtualPet turtleTest = new VirtualPet();
    int petBoredom = turtleTest.getPetBoredom();
    }

@Test
public void getHappiness() {
    VirtualPet turtleTest = new VirtualPet();
    int petHappiness = turtleTest.getPetHappiness();
    }

@Test
public void getPetTiredness() {
    VirtualPet turtleTest = new VirtualPet();
    int petTiredness = turtleTest.getPetTiredness();
    }

@Test
public void getPetPlay() {
    VirtualPet turtleTest = new VirtualPet();
    int petPlay = turtleTest.getPetPlay();
    }

@Test
public void getPetPace() {
    VirtualPet turtleTest = new VirtualPet();
    int petPace = turtleTest.getPetPace();
    }

@Test
public void getPetSwim() {
    VirtualPet turtleTest = new VirtualPet();
    int petSwim = turtleTest.getPetSwim();
    }

}







