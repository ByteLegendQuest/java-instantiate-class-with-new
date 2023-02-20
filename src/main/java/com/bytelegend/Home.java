package com.bytelegend;

import com.bytelegend.pet.Cat;

public class Home {
    public static Cat cat;

    public static void main(String[] args) {
        System.out.println(cat);
        cat = createNewCat();
        System.out.println(cat);
    }

    // Create a new Cat instance and return it
    public static Cat createNewCat() {
        if (cat != null){
            return cat;
        }
        cat = new Cat();
        return cat;
    }
}
