package com.project.testproject;

public class Calculator {
    Calculator(){};
    public int sum(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int division(int a,int b){
        int res=0;
        try{
            res =  a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return res;
    }
    public int gcd(int a,int b){
        if(a==0) return b;
        if(b==0) return a;
        return gcd(a,b%a);//galat hai ye bhai.
    }
    public int modulus(int a,int b){
        int res=0;
        try{
            res = a%b;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return res;
    }

    public String goodMorning(String name){
        return "Good morning "+name;
    }
    public boolean guessTheNumber(int number){
        return number==21;
    }
    public double paisaDoubleScheme(int teraPaisa){
        double doubledPaisa = 2.0 * teraPaisa;
        return doubledPaisa;
    }
    public String func2(String message){
        System.out.println(message);
        return message;
    }

}
