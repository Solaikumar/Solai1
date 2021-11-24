package com.simple.testng;

import org.testng.annotations.Test;

public class GroupTesting {
@Test(groups = "poi")
private void Apache1() {
System.out.println("pre test");	

}
@Test(groups = "git")
private void github1() {
	System.out.println("post test");

}
@Test(groups = "selenium")
private void selenium1() {
	System.out.println("windows handling");

}
@Test(groups = "poi")
private void Apache2() {
System.out.println("final test");

}
@Test(groups = "git")
private void github2() {
	System.out.println("ok ok");
}
@Test(groups = "selenium")
private void selenium2() {
	System.out.println(" drop down");

}
}

