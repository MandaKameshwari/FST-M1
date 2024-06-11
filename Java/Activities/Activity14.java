package activities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException{
        
        try {

            File file = new File("C:\\Users\\004OZ3744\\Desktop\\Java Activities\\fst-m1-java\\src\\main\\java\\activityfile.txt");
        boolean fstatus = file.createNewFile(); // Created new file

        // Adding text to file
        if (fstatus) {
            System.out.println("The Activity file has been created");
        }
        else {
            System.out.println("The Activity file is already available.");
            }
         // getting file object   
        File fileUtil = FileUtils.getFile("src/main/java/activities/activityfile.txt");
        //reading the file
        System.err.println("The data in the file is "+FileUtils.readFileToString(fileUtil, "UTF8"));
        //creating new directory 
        File direct = new File("Resources");
        //copying text file into directory
        FileUtils.copyFileToDirectory(file, direct);
        //get file from new directory
        File activityfile2 = FileUtils.getFile(direct, "activityfile2.txt");
        //read data from file
        String newFileData = FileUtils.readFileToString(activityfile2, "UTF8");
        // print data 
        System.out.println("Data in new file is"+ newFileData);
            
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
        
    }
