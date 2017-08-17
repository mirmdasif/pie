package net.asifhossain.pie.chapter4.stack;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

    @Test
    public void testLinkedListStack() {
        testStack(new LinkedListStack<>());
    }

    @Test
    public void testArrayListStack() {
        testStack(new ArrayStack<>());
    }

    private void testStack(Stack<Integer> integerStack) {


        integerStack.push(1);

        Assert.assertEquals(integerStack.size(), 1);

        Assert.assertFalse(integerStack.isEmpty());

        Assert.assertEquals((int)integerStack.pop(), 1);

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        Assert.assertEquals((int)integerStack.pop(), 3);
        Assert.assertEquals((int)integerStack.pop(), 2);
        Assert.assertEquals((int)integerStack.pop(), 1);

    }
}