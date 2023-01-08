package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.example.NthCharacter.nthCharacter;

public class NthCharacterTest extends TestCase {

    @Test
    public void testNthCharacter() {
        assertEquals("I = 1, T = 1, C = 1, L = 1, N = 1, A = 1", nthCharacter("ITCLiNicAl", 1));
        assertEquals("T = 1, L = 1, N = 1", nthCharacter("ITCLiNicAl", 2));
        assertEquals("C = 1, N = 1, A = 1", nthCharacter("ITCLiNicAl", 3));
        assertEquals("", nthCharacter("ITCLiNicAl", 100));
        assertEquals("", nthCharacter("ITCLiNicAl", -1));
        assertEquals("! = 1, C = 1, L = 1, 1 = 1, N = 1", nthCharacter("!tCL1Nical", 1));
    }
}