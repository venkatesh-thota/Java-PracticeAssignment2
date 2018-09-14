import java.io.*;
import java.util.*;
class fileFrequency{

    public Map<String,Integer> getfileFrequency(String fileName) throws Exception{
        File file = new File(fileName);

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st= br.readLine();
        int totalLength=0;
        Map<String,Integer> wordFrequency=new HashMap<>();
        while ((st = br.readLine()) != null)
        {   totalLength=st.length();
            String words[]=st.split(" ");
            for(int i=0;i<words.length;i++)
            {
                if(wordFrequency.containsKey(words[i])==false)
                {
                    wordFrequency.put(words[i],1);
                }
                else
                {
                    int value=wordFrequency.get(words[i]);
                    value+=1;
                    wordFrequency.put(words[i],value);
                }
            }
        }
        return wordFrequency;
    }
}