import java.io.*;
import java.util.*;
class listfiles{

    File[] files;
    String extension;
        public  ArrayList<String> getfiles(String folderPath){
            File file = new File(folderPath);
             files = file.listFiles();
            String filenames[]=new String[files.length];
             for(int i=0;i<filenames.length;i++){
            filenames[i]=files[i].getName();
            }
            ArrayList<String> fileNamesList = new ArrayList<String>(Arrays.asList(filenames));
            return fileNamesList;
        }
        public String getfile(String extension){
            getfiles("/home/cgi/Desktop/myfolder");
            for(File f: files)
            {
                if(f.getName().contains(extension)==true)
                {
                    return f.getName();
                }
            }
            return null;
        }

        public byte[] readFileContent(String fileName){

            File file = new File(fileName);
            FileInputStream fin = null;
            byte fileContent[]=new byte[(int)file.length()];;
            try {
                fin = new FileInputStream(file);
                fin.read(fileContent);
                String s = new String(fileContent);
                System.out.println("File content: " + s);
            }
            catch (FileNotFoundException e) {
                    System.out.println("File not found" + e);
                }
            catch (IOException ioe) {
                    System.out.println("Exception while reading file " + ioe);
                }
            finally {
                    try {
                        if (fin != null) {
                            fin.close();
                        }
                    }
                catch (IOException ioe) {
                        System.out.println("Error while closing stream: " + ioe);
                    }
                }
            return  fileContent;
        }

}