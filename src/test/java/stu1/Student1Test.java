package stu1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Student1Test {

    @Test
    public void testPassStudent() {

        Student1 s = new Student1("Mani", 80);
        Assert.assertEquals(s.getResult(), "Pass");
    }

    @Test
    public void testFailStudent() {

        Student1 s = new Student1("Ram", 20);
        Assert.assertEquals(s.getResult(), "Fail");
    }
}