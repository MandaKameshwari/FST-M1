package activities;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Pen");
        hs.add("Pencil");
        hs.add("Scale");
        hs.add("Eraser");
        hs.add("Sharpner");
        hs.add("PencilBox");

        for(String s :hs)
        {
            System.out.println(s);
        }
        System.out.println("The Original size of the HashSet is " + hs.size());
        System.out.println("The PencilBox value is removed from Hashset - " + hs.remove("PencilBox"));
        
        if ( hs.contains("Eraser")) {
             System.out.println("The HashSet contains Eraser");   
        }
        else {
            System.out.println("The Hashset does not contain Eraser");
        }
        // Remove an element not in hashset

       System.out.println("The Red Pen value is not in Hashset - " + hs.remove("Red Pen"));

        System.out.println("The new size of the HashSet is "+ hs.size());
    }

}
