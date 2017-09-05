package com.example.simonanger.lab_homework;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Created by simonanger on 05/09/2017.
 */

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Yogi");
    }

    @Test
    public void testHasName(){
        assertEquals("Yogi", bear.getName());
    }

    @Test
    public void testBellyStartsEmpty() {
        assertEquals(0, bear.foodCount() );
    }

    @Test
    public void testBearCanEat() {
        bear.eat("Monday", 1);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void testDayCount() {
        bear.eat("Monday", 10);
        bear.eat("Tuesday", 3);
        bear.eat("Wednesday", 2);
        assertEquals(10, bear.dayCount("Monday") );
        assertEquals(2, bear.dayCount("Wednesday") );
    }

}
