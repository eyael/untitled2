package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = " ";

        while (!user.equalsIgnoreCase("q")) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("pink");
        color.add("green");
        color.add("yellow");
        System.out.println(color.get(0) + (color.get(1) + (color.get(2))));
        //for (int i = 0; i < color.size(); i++) {

            System.out.println("enter new color");
            user = sc.nextLine();
            color.add(user);
            System.out.println(color);
           // sc.close();

        }
        }
    }

