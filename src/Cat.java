
public class Cat implements Animal,Movement {
    String raza;

    public Cat (){
        this.raza = "persa";
    }

    public void makeSound() {
        System.out.println("Meow");
    }
    public void eat() {
        System.out.println("Esta comiendo");
    }

    public void run() {
        System.out.println("ruuunnn");
    }
    public void walk() {
        System.out.println("walk");
    }
}
