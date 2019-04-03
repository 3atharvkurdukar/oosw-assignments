class Living {
    public void display()  {
        System.out.println("I am alive!");
    }
}
class Animal extends Living {
    public void display() {
        super.display();
        System.out.println("I can walk!");
    }
}
class Bird extends Animal {
    public void display() {
        super.display();
        System.out.println("I can fly!");
    }
}
public class MultilevelDemo {
    public static void main(String[] args) {
        Bird parrot = new Bird();
        parrot.display();
    }
}