package example;

import org.testng.annotations.Test;


public class MyTest {

    @Test
    public void f1() {
        MyApp myApp = new MyApp();
        myApp.sayHi();
    }
}
