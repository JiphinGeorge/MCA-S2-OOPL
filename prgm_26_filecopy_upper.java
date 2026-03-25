import java.io.*;

public class prgm_26_filecopy_upper {

    public static void main(String[] args) {

        try {
            BufferedInputStream bis = new BufferedInputStream(
                    new FileInputStream("source.txt"));

            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("dest.txt"));

            int ch;

            while ((ch = bis.read()) != -1) {
                char c = (char) ch;
                c = Character.toUpperCase(c);
                bos.write(c);
            }

            bis.close();
            bos.close();

            System.out.println("File copied with uppercase conversion!");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

// Write a Java program to copy a text file, convert all text to uppercase, and write to a new file using BufferedInputStream & BufferedOutputStream.
