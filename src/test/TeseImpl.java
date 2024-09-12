package test;

public class TeseImpl implements Test{
    @Override
    public void test1() {
        System.out.println("cc");
    }

    @Override
    public void test2() {
        Test.super.test2();
    }

}

