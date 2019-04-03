class Living {
    public void display() {
        System.out.println("I am alive!");
    }
}

class Animal extends Living {
    public void display() {
        super.display();
        System.out.println("I can move!");
    }
}

class Plant extends Living {
    public void display() {
        super.display();
        System.out.println("I have leaves!");
    }
}

public class HierarchicalDemo {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.display();
        Plant oak = new Plant();
        oak.display();
    }
}