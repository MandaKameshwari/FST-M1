package activities;

import java.util.HashMap;

public class Activity11 {

    public static void main(String[] args) {
        HashMap<Integer,String> colours = new HashMap<Integer,String>(); 
        colours.put(1, "Orange");
        colours.put(2, "Pink");
        colours.put(3, "Green");
        colours.put(4, "Blue") ; 
        colours.put(5, "Purple") ; 
        

     
        System.out.println("The original map is - "+ colours);
        System.out.println("The Original Size of the HashMap is - "+colours.size());
        colours.remove(1);
        System.out.println("Orange colour is removed");
        
        if (colours.containsValue("Green")) {

            System.out.println("Colour Green is present");
        }
        else {
            System.out.println("Colour Green is not present");
        }
        System.out.println("The Updated Size of the HashMap is - "+colours.size());

    }

}
