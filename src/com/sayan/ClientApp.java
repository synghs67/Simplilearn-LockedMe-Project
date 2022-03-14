package com.sayan;

import java.io.IOException;
import java.util.Scanner;

public class ClientApp {
    public static void main(String[] args) throws IOException {
        Scanner obj = new Scanner ( System.in );
        int ch=0;
        do {
            LockedMe.displayMenu ();
            System.out.println ("Enter your choice");
            //ch = Integer.parseInt( obj.nextLine());

            int i = obj.nextInt();
            switch (i) {
                case 1 : LockedMe.getAllFile ();
                    break;
                case 2 : LockedMe.createFile ();
                    break;
                case 3 : LockedMe.deleteFile ();
                    break;
                case 4 : LockedMe.searchFile ();
                    break;
                case 5 : System.exit ( 0 );
                    break;
                default:
                    System.out.println ("Invalid option");

            }

        }
        while (ch>0);
          obj.next ();
          obj.close ();
    }
}
