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
}
