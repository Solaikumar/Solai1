package com.simple.testng;

import org.testng.annotations.Test;

public class PriorityTest {
@Test(priority = 4)
private void Airplanes() {
	System.out.println("one");
}
@Test(priority = 3)
private void bike() {
	System.out.println("Two");

}
@Test(priority = -2)
private void car() {
	System.out.println("Three");
}
@Test(priority = -3)
private void grocery() {
	System.out.println("four");
}
@Test
private void shops() {
	System.out.println("five");

}
}
