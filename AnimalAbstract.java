abstract class Animal{
    abstract void Sound();
}
class Lion extends Animal{
     void Sound(){
        System.out.println("Hello Froom lion class");
    }
} 
class Tiger extends Animal{
     void Sound(){
        System.out.println("Hello from Tiger class");
    }
}
public class AnimalAbstract {

    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.Sound();

        Tiger t1 = new Tiger();
        t1.Sound();
    }
    
}
