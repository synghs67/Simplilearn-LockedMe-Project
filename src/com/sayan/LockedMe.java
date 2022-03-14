package com.sayan;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe {
    static final String projectFilesPath = "D:\\All File";
    public static void displayMenu(){
        System.out.println ("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println ("\t Welcome To Locked-me.com App");
        System.out.println ("\t Developed by :- Mr. Sayan Ghosh");
        System.out.println ("************************************************************");
        System.out.println ("\t1. Display all files");
        System.out.println ("\t2. Add a new file");
        System.out.println ("\t3. Delete a file ");
        System.out.println ("\t4. Search a file");
        System.out.println ("\t5. Exit");
        System.out.println ("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }
       public static void getAllFile(){
           File folder = new File ( projectFilesPath );
           File [] listOfFile = folder.listFiles ();
           if (listOfFile.length>0)
           {
               System.out.println ("Files list is below:\n");

               for (int i = 0; i < listOfFile.length; i++) {
                   System.out.println ( listOfFile[i].getName () );
               }
           }
           else {
               System.out.println ("FILE NOT FOUND");
           }

       }
       public static void  createFile() throws IOException
       {
           try {

               Scanner obj = new Scanner ( System.in );
               String filename;
               System.out.println ( "Enter the file name" );
               filename = obj.nextLine ();

               int countLine ;
               System.out.println ( "Enter how many line you want to write in a file" );
               countLine = Integer.parseInt ( obj.nextLine () );
               FileWriter fw = new FileWriter (projectFilesPath+"\\"+filename+".txt" );
               for (int i = 1; i <= countLine; i++) {
                   System.out.println ("Enter file line");
                   fw.write ( obj.nextLine () + "\n" );
               }

               System.out.println ("New file is created");
               fw.close ();
           }
            catch (Exception Ex)
            {

           }
       }
       public static void deleteFile(){
        try {

            Scanner obj = new Scanner ( System.in );
            String filename;
            System.out.println ( "Enter the file name" );
            filename = obj.nextLine();
            File f = new File (projectFilesPath+ "\\" + filename);
            if (f.exists ())
            {
                f.delete ();
                System.out.println ("File deleted successfully");
            }
              else {
                System.out.println ("File doesn't exist");

             }
        }
        catch (Exception Ex) {
            System.out.println ("Unable to delete @@@ please contact on 9932663368");
        }

       }
       public static void searchFile() {
        try {
            Scanner obj = new Scanner ( System.in );
           String filename;
           System.out.println ( "Enter the file name" );
           filename = obj.nextLine();
            ArrayList <String> allFilesName  = new ArrayList<> ();
            File folder = new File (projectFilesPath  );
            File [] listOfFile = folder.listFiles ();
            if (listOfFile.length>0){
                for (var l:listOfFile) {
                    allFilesName.add ( l.getName () );
                }

            }
           File f = new File ( projectFilesPath+"\\"+filename );
            if (allFilesName.contains ( filename )){
                System.out.println ("File is available ");
            }
            else {
                System.out.println ("File not available");
            }
       }
        catch (Exception Ex) {

        }
       }
}
