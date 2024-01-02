package il.ac.kinneret.mjmay.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleModelClassTest {

    @Before
    public void setUp() {
    }

    @Test
    public void add() {
        assertEquals(7, SampleModelClass.add(3,4));
    }
}