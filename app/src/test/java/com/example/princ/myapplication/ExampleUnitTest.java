package com.example.princ.myapplication;

import android.support.v4.media.MediaMetadataCompat;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void bf_isCorrect() throws Exception {
        assertEquals(0, StringUtil.bf("ab".toCharArray(), "ab".toCharArray()));
        assertEquals(12, StringUtil.bf("abcdabcabcacabcabcd".toCharArray(), "abcabcd".toCharArray()));
        assertEquals(-1, StringUtil.bf("abcd".toCharArray(), "bad".toCharArray()));
    }

    @Test
    public void kmp_isCorrect() throws Exception {
        assertEquals(0, StringUtil.kmp("ab".toCharArray(), "ab".toCharArray()));
        assertEquals(12, StringUtil.kmp("abcdabcabcacabcabcd".toCharArray(), "abcabcd".toCharArray()));
        assertEquals(-1, StringUtil.kmp("abcd".toCharArray(), "bad".toCharArray()));
    }

    @Test
    public void trim_isCorrect() throws Exception {
        assertArrayEquals("abcd".toCharArray(), StringUtil.trim("   abcd ".toCharArray()));
        assertArrayEquals("abc".toCharArray(), StringUtil.trim("\t\n    abc\n\t".toCharArray()));
    }
}