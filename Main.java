//Name: Rafael Figueroa
//Date: 2/4/2025
//Assignment: Week 4; Assignment 1(Inheritance and Polymorphism)
//Partners: Ben and Kennedi 




import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();
        Fish fish = new Fish();
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println("Which animal do you want to know about? (Fish, Dog, Cat, Lion)");
        String iWantToSee = scanner.nextLine();
        switch (iWantToSee) {
            case "Dog":
            dog.intro();
            break;
            case "Fish":
            fish.intro();
            break;
            case "Cat":
            cat.intro();
            break;
            case "Lion":
            lion.intro();
            break;
        }
    }
}