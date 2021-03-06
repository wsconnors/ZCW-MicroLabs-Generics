package StackArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private ArrayList<E> arrayList = new ArrayList<>();
    private E[] elements ;

    public GenericStack() {
       elements = (E[])arrayList.toArray();
    }

    public void push(E element){
        elements = Arrays.copyOf(elements,elements.length+1);
        elements[elements.length-1] = element;
    }

    public E pop() throws IndexOutOfBoundsException{
        E returnElement = elements[elements.length-1];
        elements = Arrays.copyOf(elements,elements.length-1);
        return returnElement;

    }

    public boolean isEmpty(){
        return elements.length == 0;
    }

}
