import java.io.*;
//import java.util.List;

class PopulateListOfEdges {

    public static void populate() {

        File csvFile = get_file();
        try (BufferedReader file_reader = new BufferedReader(new FileReader(csvFile))) {
            String st;
            while ((st = file_reader.readLine()) != null)
                System.out.println(st);


        } catch (IOException e) {
            e.printStackTrace();
        }

        //return null;
    }

    public static File get_file(){
        File file = new File("C:/Users/Anuran/Desktop/Top K Graph Pattern Search/fuzzy_matching_code_uml classes/T101.csv");
        return file;
    }

    public  static void main (String[] args ){
        populate();
    }

}
