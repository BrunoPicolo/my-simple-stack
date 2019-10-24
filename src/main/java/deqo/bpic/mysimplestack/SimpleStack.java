package deqo.bpic.mysimplestack;

import java.util.EmptyStackException;

public interface SimpleStack {
    /**
     * Test if this stack is empty
     * @return
     */
    public boolean isEmpty();

    /**
     * Returns the number of itmems in this stack
     * @return
     */
    public int getSize();

    /**
     * Pushes an itme onto the top of this stack
     * null item is allowed
     * @param item
     */
    public void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it from the stack
     * @return
     * @throws EmptyStackException
     */
    public Item peek() throws EmptyStackException;

    /**
     * Removes the object at the top of this stack and returns that object as the value of this function
     * @return
     * @throws EmptyStackException if this stack is empty
     */
    public Item pop() throws EmptyStackException;

}
