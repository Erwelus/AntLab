package main.test;

import main.java.Sayer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;



public class SayerTest {

    private String str1;
    private String str2;
    private Sayer sayer1;
    private Sayer sayer2;
    private Sayer sayer3;

    @Before
    public void setUp() {
        str1 = "Hello there";
        str2 = "";

        sayer1 = new Sayer(str1);
        sayer2 = new Sayer(str2);
        sayer3 = new Sayer(null);
    }

    @Test
    public void testSayAssign() {
        sayer2.say();
        Assert.assertNotEquals(str2, sayer2.getSaying());
    }

    @Test
    public void testSayNPE(){
        Assert.assertThrows(NullPointerException.class, ()-> sayer3.say());
    }

    @Test
    public void testSetSaying() {
        sayer1.setSaying("Hey there");
        Assert.assertNotEquals(str1, sayer1.getSaying());
    }
}