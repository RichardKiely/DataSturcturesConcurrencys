import Lab2.CP3LinkedList;
import Lab4.Factorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {
    private CP3LinkedList<String> list;

    @BeforeEach //executed before each test
    void create(){
        list = new CP3LinkedList<>();
    }

    @Test
    void addFirst() {
    }

    @Test
    void getFirst() {
    }

    @Test
    void removeFirst() {
    }

    @Test
    void print() {

    }
/*
    @Test
    void size() {

        int size = list.size();
        assertEquals(0,list.size());


        list.addFirst("Sue");
        assertEquals(1,list.size());

        list.addFirst("Sue");
        list.addFirst("Bob");
        assertEquals(3,list.size());

    }

*/

    @Test
    void sum(){
        int [] list = {10};
        int actual = Factorial.sum(list);
        assertEquals(10,actual);

        int [] list1 = {1,2,3,4};
        assertEquals(10,Factorial.sum(list1));

    }
    @Test
    void size() {

        assertEquals(0,list.size());

        list.addFirst("Sue");
        assertEquals(1,list.size());

        list.addFirst("Sue");
        assertEquals(2,list.size());

        list.addFirst("Sue");
        list.addFirst("Bob");
        assertEquals(4,list.size());
    }

    @Test
    void contains() {
        list.addFirst("Stuey");
        assertEquals(false,list.contains("Stue"));
    }
}