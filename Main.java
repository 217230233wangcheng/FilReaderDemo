import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main{
    public static void main(String[] args) throws Exception{
        String filePathForWindows="C:\\Program Flies\\Groceries.txt";
        String fileToWriter="/User/pram/Downloads/ABC.txt";
        String []array=new String[4];
        String id;
        String itemName;
        String quantity;
        double price;
        String separtor=",";
        double total=0;
        FileReader filereader=new FileReader(filePathForWindows);
        FileWriter fileWriter=new FileWriter(fileToWriter);
        BufferedReader reader = new BufferedReader(filereader);
        BufferedWriter writer=new BufferedWriter(fileWriter);
        String line;
        while((line=reader.readLine())!=null){
            array=line.split(separtor);
            price=Double.parseDouble(array[3]);
            total+=price;
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }
        System.out.println("\n"+"Total price of groceries:"+Math.round(total));
        writer.write("\n"+"Total price of groceries:"+Math.round(total));
        reader.close();
        writer.flush();
        writer.close();
    }
}
  