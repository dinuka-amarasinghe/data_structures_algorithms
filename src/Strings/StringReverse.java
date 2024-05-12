package Strings;

import java.sql.SQLOutput;

public class StringReverse {

    public static String reverse(String s) {
        if (s == null || s.isEmpty()) {
            return "-";
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverse2(String s) {
        if (s == null || s.isEmpty()) {
            return "-";
        }
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println("Reverse 1");
        System.out.println(reverse(null));
        System.out.println(reverse(""));
        System.out.println(reverse("hello"));
        System.out.println(reverse("tacos"));
        System.out.println(reverse("Hi!"));
        System.out.println("Reverse 2");
        System.out.println(reverse2(null));
        System.out.println(reverse2(""));
        System.out.println(reverse2("hello"));
        System.out.println(reverse2("tacos"));
        System.out.println(reverse2("Hi!"));
    }
}
