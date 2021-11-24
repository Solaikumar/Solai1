package com.simple.testng;

import org.testng.annotations.Test;

public class ExceptionTest {
@Test(expectedExceptions=Exception.class)
private void testing() {
int i=10/0;

}
}
