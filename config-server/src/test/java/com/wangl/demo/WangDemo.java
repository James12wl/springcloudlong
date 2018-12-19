package com.wangl.demo;

import org.junit.Test;

public class WangDemo {

    @Test
    public void digui(){

        Factorial factorial = new Factorial();
        System.out.println("factorial(10)="+factorial.fact(10));

    }
}

class Factorial{
    //递归函数
    int fact(int n){
        if(n == 1){
            return 1;
        }else{
            return fact(n-1)*n;
        }
    }
}