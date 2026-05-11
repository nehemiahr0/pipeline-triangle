package com.example

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testIsTriangle() {
        Triangle t = new Triangle();
        assertTrue(t.isTriangle(3, 4, 5));
    }
}