package com.taverok.struct.stack;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {
    private Stack stack;

    @Before
    public void beforeEach(){
        stack = new Stack();
        for(int i = 0; i < 100; i++){
            stack.push(i);
        }
    }

    @Test
    public void testPushPop() {
        for(int i = 99; i >= 0; i--){
            assertEquals(stack.pop(), i);
        }
    }
}
