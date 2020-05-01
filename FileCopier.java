import java.io.*;
public class FileCopier {
    public static void main(String[] args) {
        BufferedReader br=null;
        PrintWriter pw=null;
        try{
            br=new BufferedReader(new FileReader(args[0]));
            File fin=new File(args[1]);
            if(!fin.exists()){
                fin.createNewFile();
            }
            pw=new PrintWriter(fin);
            String line;
            while((line=br.readLine())!=null){
                pw.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                br.close();
                pw.close();
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}