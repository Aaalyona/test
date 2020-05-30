import com.sun.deploy.security.SelectableSecurityManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.Scanner;

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
        String s1 = "I have " + n + f + " skills" + "." + " ";
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
        System.out.println(f);
    }

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
        } else {
            System.out.println("Good evening.");

        }


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
    @Test
    public void test00011() {
        int a=321;
        int result= a == 322 ? 11 : 888;
        System.out.println(result);
    }
    @Test
    public void test00012() {
        int c = 20;
        while(c<=100){
        System.out.println("yes"+c);
        c=c+1;} //c++

    }
    @Test
    public void test00013() {
        float a = 12.5f;
        if (a < 10) {
            System.out.println("good");
        } else if (a==10) {
            System.out.println("not");
        } else {
            System.out.println("yes");
        }



    }


    @Test //нельзя напечатать
    public void test00014() {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите предложение");
        String adg=s.nextLine();
        System.out.println(adg);

    }
    @Test //нельзя напечатать
    public void test00015() {
        Scanner t=new Scanner(System.in);
        int a;
        do{
            System.out.println("input 5");
            a = t.nextInt();
        } while (a!=5);
        System.out.println("you inputted 5 ");


    }

    @Test
    public void testPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0)

            { System.out.println(i);}
        }
    }
    @Test
    public void printHelloAtEvenNumbers1() {
        for (int i = 1; i < 10; i++) {
            if (i%2==0) System.out.println("hello world");
        }
    }
    @Test
    public void printHelloAtEvenNumbers2() {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) System.out.println("hello world");
        }
    }



    //swap two numbers in an array
    //1. create an input array
    //2. create a method with int[] parameters
    //3. new method will also take indexes of L and R elements
    //4. use indexes R and L and respective elements will be swapped with each other
    //5. print out final version of the array

    @Test
    public void test_swapNumbers(){
        int[] x = {1,2,3,4,5,6};
        int indexL = 0;
        int indexR = 1;

        swap(x,indexL,indexR);
       printAllMembersOfArray(x);
    }

    public void swap(int[] x, int indexL, int indexR) {
    }

    public void printAllMembersOfArray(int[] x) {
    }
    @Test
    public void test_ActorCreation(){
        Actor actor01 = new Actor(30,"Ivan","Ivanov",183,88);

        int actor01Age = actor01.getAge();
        System.out.println(actor01Age);

            Assert.assertEquals(actor01Age, 30);




    }


        }