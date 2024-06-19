import java.io.*;

public class Main {
    public static void main(String[] args) {
        String [] names = {"John","Carl","Jerry"};
        try {
            BufferedWriter writter = new BufferedWriter(new FileWriter("output.txt"));
            writter.write("Writing to a file.");
            writter.write("\nHere is another line.");
            for(String name:names){
                writter.write("\n"+name);
            }
            writter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line=reader.readLine())!=null){
               // System.out.println(reader.readLine());//while olmasa sadece bir satırı okur
                System.out.println(line);
            }
            System.out.println(reader.readLine());//sadece bir satırı okur
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}