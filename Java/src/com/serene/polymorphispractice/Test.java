package com.serene.polymorphispractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Test {
    public static void main(String[] args) {
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();

        animalDog.setAge(2);
        animalDog.setColor("黑颜色");

        animalCat.setAge(3);
        animalCat.setColor("灰颜色");

        Keeper keeper1 = new Keeper();
        keeper1.setAge(30);
        keeper1.setName("老王");

        Keeper keeper2 = new Keeper();
        keeper2.setAge(25);
        keeper2.setName("老李");

        keeper1.keepPet(animalDog);
        keeper2.keepPet(animalCat);
    }

}
