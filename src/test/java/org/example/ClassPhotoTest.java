package org.example;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ClassPhotoTest {
    @Test
    public void TestCase1() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(6, 9, 2, 4, 5));
        boolean expected = true;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase2() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(6, 9, 2, 4, 5));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4));
        boolean expected = true;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase3() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(6, 9, 2, 4, 5, 1));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(5, 8, 1, 3, 4, 9));
        boolean expected = false;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase4() {
        ArrayList<Integer> red = new ArrayList<>(List.of(6));
        ArrayList<Integer> blue = new ArrayList<>(List.of(6));
        boolean expected = false;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase5() {
        ArrayList<Integer> red = new ArrayList<>(List.of(126));
        ArrayList<Integer> blue = new ArrayList<>(List.of(125));
        boolean expected = true;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase6() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));
        boolean expected = true;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase7() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(5, 6, 7, 2, 3, 1, 2, 3));
        boolean expected = false;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase8() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2));
        boolean expected = true;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase9() {
        ArrayList<Integer> red = new ArrayList<>(List.of(125));
        ArrayList<Integer> blue = new ArrayList<>(List.of(126));
        boolean expected = true;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase10() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(19, 2, 4, 6, 2, 3, 1, 1, 4));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(21, 5, 4, 4, 4, 4, 4, 4, 4));
        boolean expected = false;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase11() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(19, 19, 21, 1, 1, 1, 1, 1));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(20, 5, 4, 4, 4, 4, 4, 4));
        boolean expected = false;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase12() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(3, 5, 6, 8, 2));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(2, 4, 7, 5, 1));
        boolean expected = true;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase13() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(3, 5, 6, 8, 2, 1));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(2, 4, 7, 5, 1, 6));
        boolean expected = false;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase14() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(4, 5));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(5, 4));
        boolean expected = false;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }

    @Test
    public void TestCase15() {
        ArrayList<Integer> red = new ArrayList<>(Arrays.asList(5, 6));
        ArrayList<Integer> blue = new ArrayList<>(Arrays.asList(5, 4));
        boolean expected = true;
        boolean actual = Main.classPhotos(red, blue);
        assertEquals(expected, actual);
    }
}