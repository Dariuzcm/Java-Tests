package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayDiffTest {

	@Test
	public void tests() {
            assertArrayEquals(new int[] {2}, ArrayDiff.diff(new int [] {1,2}, new int[] {1}));
            assertArrayEquals(new int[] {2,2}, ArrayDiff.diff(new int [] {1,2,2}, new int[] {1}));
            assertArrayEquals(new int[] {1}, ArrayDiff.diff(new int [] {1,2,2}, new int[] {2}));
            assertArrayEquals(new int[] {1,2,2}, ArrayDiff.diff(new int [] {1,2,2}, new int[] {}));
            assertArrayEquals(new int[] {}, ArrayDiff.diff(new int [] {}, new int[] {1,2}));
            assertArrayEquals(new int[] {5,2}, ArrayDiff.diff(new int [] {5,2}, new int[] {}));
            assertArrayEquals(new int[] {9,4,2,52,22}, ArrayDiff.diff(new int [] {9,4,2,23,5,52,83,22}, new int[] {83,24,23,5}));
	}

}
