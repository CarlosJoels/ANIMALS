package org.example.porky;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void animalSize() {
        System.out.println("The animal is of size");
    }

}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void animalSize() {
        System.out.println("The pig is: small");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }

    public void animalSize() {
        System.out.println("The dog is: Medium");
    }
}
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        
        myDog.animalSound();
        myPig.animalSound();


        System.out.println("");
        System.out.println("");

        myAnimal.animalSize();
        myDog.animalSize();
        myPig.animalSize();

    }
}


