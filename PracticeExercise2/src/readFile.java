import java.io.*;
class readFile{

        public  String readFile(String filename)throws Exception
        {
            File file = new File(filename);

            BufferedReader br = new BufferedReader(new FileReader(file));

            String st,totalFile="";
            int totalLength=0;
            while ((st = br.readLine()) != null)
            {   totalLength+=st.length();
                totalFile+=st.toLowerCase();
                System.out.println(st.toLowerCase());
            }
            System.out.println("Total Length Of File is: "+totalLength);
           return totalFile;
        }

}