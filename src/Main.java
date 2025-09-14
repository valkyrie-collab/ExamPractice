import com.valkyrie.class_inteface.AnimalBehavoir;
import com.valkyrie.class_inteface.DogBehavior;
import com.valkyrie.composition.AreaAndVolumeOfCuboid;
import com.valkyrie.contructor_chaining.Cuboid;
import com.valkyrie.contructor_chaining.Rectangle;
import com.valkyrie.fibonacci.Fibonacci;
import com.valkyrie.palindrome.Plaindrome;
import com.valkyrie.polimorphism.Animal;
import com.valkyrie.polimorphism.Cat;
import com.valkyrie.polimorphism.Dog;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        animal.walking(); animal.sound(); animal.numberOfLegs();

        Animal dog = new Dog();
        dog.walking(); dog.sound(); dog.numberOfLegs();

        Cat cat = new Cat();
        cat.walking(); cat.sound(); cat.numberOfLegs();

        AreaAndVolumeOfCuboid.initialize(67, 90, 40);

        Rectangle rectangleOne = new Rectangle(20);
        Rectangle rectangleTwo = new Rectangle(10, 20);
        Rectangle rectangleThree = new Rectangle(10, 20, 30);
        rectangleOne.getArea(); rectangleTwo.getArea(); rectangleThree.getArea();

        Cuboid cuboidOne = new Cuboid(10);
        Rectangle cuboidTwo = new Cuboid(30, 40, 7);
        Cuboid cuboidThree = new Cuboid(40, 5, 10);
        cuboidOne.getVolume(); cuboidTwo.getArea(); cuboidThree.getVolume();

        AnimalBehavoir dogBehavior = new DogBehavior();
        dogBehavior.walking(); dogBehavior.sound(); dogBehavior.behavior();
        System.out.println(dogBehavior.whatWeConclude());

        Fibonacci.doFibonacci();

        Plaindrome.checkPalindrome(321); //same same xor provide null value
    }
}
