package deqo.bpic.mysimplestack;

import javax.jws.Oneway;
import java.util.EmptyStackException;
import java.util.Stack;


/**
 * Created by Bruno on 24/10/2019
 *
 *  Mailstone Implementation
 */
public class SimpleStackImplementation implements SimpleStack {
    private Stack<Object> stack = new Stack<Object>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) stack.pop();
    }
}
