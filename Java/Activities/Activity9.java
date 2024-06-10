package activities;

import java.util.ArrayList;

public class Activity9 {

    public static void main(String[] args) {
        //creating array list with name myList 
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Rose");
        myList.add("Jasmine");
        myList.add("Mariegold");
        myList.add(3, "Lily");
        myList.add(2, "Sunflower");

        // for(String i:myList){
        //     System.out.println(i);
        // }   

        for(int i=0; i<myList.size() ; i++){

            System.out.println(myList.get(i));
        }
        System.out.println("The thrid element in the list is -" +myList.get(2));
        System.out.println("Check if Mariegold is present in the list" +myList.contains("Mariegold"));
        System.out.println("The size of the list is - " + myList.size());

        myList.remove("Rose");
        System.out.println("The new size of the list is - " + myList.size());

    }
}
