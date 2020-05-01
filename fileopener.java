import java.io.*;

public class fileopener {
    public static void main(String[] args) {
    BufferedReader br=null;
    try {
        br=new BufferedReader(new FileReader("Test.txt"));
        String line;
        while((line=br.readLine())!=null){
            if(line.charAt(0)=='/' && line.charAt(1)=='/'){
                System.out.println(line);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }finally{
        try {
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

}