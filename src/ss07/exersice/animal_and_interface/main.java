package ss07.exersice.animal_and_interface;
import
public class main {
        public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
            for (Animal animal : animals) {
                animal.makeSound();
            }
        }
    }
