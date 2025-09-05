package com.pedrohk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScrambleStringTest {

    private ScrambleString scrambleString;

    @BeforeEach
    void setUp() {
        scrambleString = new ScrambleString();
    }

    @ParameterizedTest
    @CsvSource({
            "great, rgeat, true",
            "abcde, caebd, false",
            "a, a, true",
            "a, b, false",
            "ab, ba, true",
            "abc, bca, true",
            "abc, acb, true",
            "coder, ocedr, true",
            "eebaacbcbcadaaedceaaacadccd, eadcaacabaddaceacbceaabeccd, false",
            "abcdefghijklmnopq, efghijklmnopqcadb, false",
            "abcd, bdac, false",
            "great, eatgr, true",
            "abb, bab, true",
            "phqtrnilf, ftrilnphq, true"
    })
    void testIsScramble(String s1, String s2, boolean expected) {
        assertEquals(expected, scrambleString.isScramble(s1, s2));
    }
}
