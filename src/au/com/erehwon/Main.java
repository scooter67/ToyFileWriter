// USERNAME on line 12 needs to be changed for this to work.


package au.com.erehwon;


import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String filename = "/home/USERNAME/test.txt";
        try {

            MyFileWriter data = new MyFileWriter(filename, false);
            data.writeToFile("Here we are now, entertain us!");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }
}
