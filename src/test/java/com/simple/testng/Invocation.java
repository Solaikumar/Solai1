package com.simple.testng;

import org.testng.annotations.Test;

public class Invocation {
@Test
private void searchLaptop() {
	System.out.println("DELL");
}
@Test(invocationCount = 3)
private void mobiles() {
	System.out.println("Mobiles");
}
@Test
private void grocery() {
	System.out.println("fruits");
}
@Test(invocationCount = 5)
private void market() {
	System.out.println("fish");
}
}
