public class A150OverrideTest {
    public static void main(String[] args) {
        A150OverrideAnimal animal = new A150OverrideAnimal();
        animal.move();

        A150OverrideCat cat = new A150OverrideCat();
        cat.move();

        A150OverrideBird bird = new A150OverrideBird();
        bird.move();
    }
}
