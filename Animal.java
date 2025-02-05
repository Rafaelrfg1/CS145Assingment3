


//This contains all the methods that other subclasses can inherit and change based on desired output. 

public class Animal {

    String name;
    String words;
    String speed;
    String behavior;

    

    void intro() {
        myName();
        mySpeed();
        myWords();
        myBehavior();
    }
    void myName() {
        System.out.println(name);
    }
    void mySpeed() {
        System.out.println(speed);
    }
    void myWords(){
        System.out.println(words);
    }
    void myBehavior(){
        System.out.println(behavior);
    }

}