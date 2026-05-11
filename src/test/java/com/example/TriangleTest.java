package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testTriangleValide() {
        Triangle t = new Triangle();
        assertTrue(t.isTriangle(3, 4, 5));
    }

    @Test
    public void testTriangleInvalide() {
        Triangle t = new Triangle();
        assertFalse(t.isTriangle(1, 2, 10));
    }

    @Test
    public void testTriangleEquilateral() {
        Triangle t = new Triangle();
        assertTrue(t.isTriangle(5, 5, 5));
    }

    @Test
    public void testCotesAlignes() {
        Triangle t = new Triangle();
        assertFalse(t.isTriangle(3, 4, 7)); // 3+4=7, pas strictement supérieur
    }
}