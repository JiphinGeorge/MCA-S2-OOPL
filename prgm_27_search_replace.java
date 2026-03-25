import java.io.*;
import java.util.Scanner;

public class prgm_26_search_replace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word to search: ");
        String search = sc.nextLine();

        System.out.print("Enter replacement word: ");
        String replace = sc.nextLine();

        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                if (line.contains(search)) {
                    count++;
                    line = line.replace(search, replace);
                }

                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Replacements made: " + count);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
//Write a Java program to perform Search and Replace in a file and count number of replacements.
