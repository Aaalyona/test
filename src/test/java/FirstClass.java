import org.testng.annotations.Test;

public class FirstClass {

    @Test
    public void test00001() {
        System.out.println("Hello, world!");
    }

    @Test
    public void test00002() {
        int myNumber = 5;
        System.out.println(myNumber);
    }

    @Test
    public void test00003() {

        String a1 = "Who let the dogs out?";
        String a2 = "Who who who who!";
        String a3 = a1 + a2;
        System.out.print(a3);
    }

    @Test
    public void test00004() {
        byte n = 7;
        int f = 77;
        char c1 = 'Q';
        char c2 = 'A';
        String s1 = "I have " + n + f + " skills" + "." + " " ;
        String s2 = "I love" + " " + c1 + c2 + ".";
        String s3 = s1 + s2;
        System.out.print(s3);

    }

    @Test
    public void test00005() {
        String txt = "Hello World";
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("H"));
        String a = "Q";
        String b = "A";
        System.out.println(a.concat(b));
        String f = "We are the so-called \"Vikings\" from the north.";
        System.out.println(f);  }

    @Test
    public void test00006() {
        String txt = "He\rllo World!";
        System.out.println(txt);
        System.out.println(Math.random());

    }

    @Test
    public void test00008() {
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }

    @Test
    public void test00007() {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        }else {
            System.out.println("Good evening.");

        }
//


    }

    @Test
    public void test00009() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

    }


    @Test
    public void test00010() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }








}