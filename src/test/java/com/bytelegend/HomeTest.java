package com.bytelegend;

import com.bytelegend.pet.Cat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void test() {
        Assertions.assertNotEquals(Home.createNewCat(), Home.createNewCat());
        Home.main(null);
        Assertions.assertTrue(Home.cat instanceof Cat);
    }
}
