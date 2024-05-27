/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pangrams;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class Pangrams {

    public static String pangrams(String s) {
        HashMap<Integer, Character> chars = new HashMap<>();
        for (int i = 0; i <= 25; i++) {
            chars.put(i, (char) ('A' + i));
        }
        s = s.toUpperCase();
        for (char c : s.toCharArray()) {
            if (chars.containsKey((int) (c - 'A'))) {
                int dif = (int) (c - 'A');
                chars.remove(dif);
            }
        }
        if (chars.isEmpty()) {
            return "pangram";
        }
        return "not pangram";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pangrams(s));
    }

}
