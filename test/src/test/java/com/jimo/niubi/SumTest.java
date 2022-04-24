package com.jimo.niubi;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void add() {
        final Sum s = new Sum();
        assertEquals(2, s.add(1, 1));
        assertEquals(100, s.add(-3, 103));
    }
}