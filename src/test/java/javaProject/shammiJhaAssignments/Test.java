package javaProject.shammiJhaAssignments;

class Demo
{
    static int var=9;
    public static void func()
    {
        System.out.println("learning static keyword");
    }
}
public class Test
{

    public static void main(String s[])
    {
        Demo ob = new Demo();
        ob.var=9;
        ob.func();
        ob.func();
    }
}