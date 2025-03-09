package Helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helpers {


    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static String readLine() throws IOException {
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }


}
