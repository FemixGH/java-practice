package second_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DogNursery {
    private List<Dog> dog_kennel_array = new ArrayList<Dog>();

    {
        System.out.println("\n[+] Dog kennel object was created");
    }

    // Add one dog
    public void add_dog(Dog dog) {
        this.dog_kennel_array.add(dog);
        System.out.println(dog + ". This dog added into the dog kennel successfully");
    }

    // Add many dogs
    public void add_dogs(Dog dogs[]) {
        //this.dog_kennel_array = Stream.concat(Arrays.stream(this.dog_kennel_array.toArray()), Arrays.stream(dogs)).toArray(Dog[]::new);
        this.dog_kennel_array.addAll(new ArrayList<Dog>(Arrays.asList(dogs)));
        System.out.println("Dogs: " + Arrays.toString(dogs) + " added into the dog kennel successfully");
    }

    public String toString() {
        if (!this.dog_kennel_array.isEmpty()) return "Dog kennel: " + this.dog_kennel_array;
        else return "Dog kennel empty!";
    }

}