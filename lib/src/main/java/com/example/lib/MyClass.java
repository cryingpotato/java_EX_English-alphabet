package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input:");
        char c = input.next().charAt(0);
        change(c);
    }

    private static void change(char c) {
        //如果輸入的是大寫，+32即可得到小寫
        if(c>='A' && c<='Z'){
            c+=32;
            System.out.println("input word"+(char)(c-32)+"change:"+c);
        }else if(c>='a' && c<='z'){  //如果輸入的是小寫，-32即可得大小寫
            c-=32;
            System.out.println("the word"+(char)(c+32)+"change:"+c);
        }else{
            System.out.println("error");
        }
    }
}
