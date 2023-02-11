package com.mycompany.app.Futbol;

import java.util.Random;

public class Utils {
	
	public static int randomScore() {
		Random rand = new Random();
		return rand.nextInt(5);
	}
	
	public static void shuffle(String [] arr){
        int index;
        String temp;
        Random rand = new Random();
        int i = arr.length - 1;
        while ( i > 0)
        {
            index = rand.nextInt(i + 1);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
            i--;
        }
    }

}
