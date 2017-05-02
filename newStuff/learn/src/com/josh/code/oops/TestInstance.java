package com.josh.code.oops;

/**
 * Created by Munish on 4/27/17.
 */
public class TestInstance {

    public static void main(String[] args) {

        SuperInstance sp = new SuperInstance();

        SubInstance si = new SubInstance();

        if (sp instanceof SuperInstance) {
            System.out.println("Yes its super instance from super instance");
        }


        if (si instanceof SubInstance) {

            System.out.println("Yes its sub instance from sub instance");
        }

        if (si instanceof SuperInstance) {
            System.out.println("Yes, its super instance from sub instance");
        }

    }

}
