package deqo.bpic.mysimplestack;

import java.lang.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackImplementationTest {
    SimpleStack simpleStack;

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImplementation();
        System.out.println("Nouvelle stack");
    }

    @Test
    public void testIsEmpty() {
        Assert.assertEquals(true, simpleStack.isEmpty());
        simpleStack.push(new Item("toto"));
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() {
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(new Item("toto1"));
        simpleStack.push(new Item("toto"));
        Assert.assertEquals(2, simpleStack.getSize());
    }

    @Test
    public void testPush() {
        Item item = new Item(3);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(item);
        Assert.assertEquals(1, simpleStack.getSize());
        Item first = simpleStack.peek();

        Assert.assertEquals(1, simpleStack.getSize());
        Assert.assertTrue(first.getValue() instanceof Integer);
        Integer integer = (Integer)first.getValue();
        Assert.assertEquals(3, integer.intValue());
        Assert.assertEquals(first.getValue(), integer);
    }

    @Test
    public void testPeek() {
        Item item = new Item(3);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(item);
        Assert.assertEquals(1, simpleStack.getSize());
        Item first = simpleStack.peek();

        Assert.assertEquals(1, simpleStack.getSize());
        Assert.assertTrue(first.getValue() instanceof Integer);
        Integer integer = (Integer)first.getValue();
        Assert.assertEquals(3, integer.intValue());
        Assert.assertEquals(first.getValue(), integer.intValue());
    }

    @Test
    public void testPop() {
        Item item = new Item(3);
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(item);
        Assert.assertEquals(1, simpleStack.getSize());
        Item first = simpleStack.pop();

        Assert.assertEquals(0, simpleStack.getSize());
        Assert.assertTrue(first.getValue() instanceof Integer);
        Integer integer = (Integer)first.getValue();
        Assert.assertEquals(3, integer.intValue());
        Assert.assertEquals(first.getValue(), integer.intValue());
    }
}