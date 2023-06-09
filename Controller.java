/*
 * 
 * The following file contains the main controlling file of the program
 * and suggested steps to completing the program.
 * You may change anything you see fit, or follow the hints typed out for you.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class Controller{
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create two File objects to open the EnvironmentalData.txt file 
        // and the SpeciesData.txt file
        File envfile = new File("EnvironmentalData.txt");
        File spfile = new File("SpeciesData.txt");
        

        // creating a new database
        Database db = new Database();

        try{
            // read your file in and gather the data from the EnvironmentalData.txt file
            Scanner fileRead = new Scanner(envfile);
                
            // use a loop to read your file
            // keep an index tracker (perhaps a counter?)
            int numofrows = 0;
            String line;
            while (fileRead.hasNext()){
                line = fileRead.nextLine();
                // if the line contains the word "Quadrat" ignore it, since it's a table header
                if (line.contains("Quadrat")) {
                    continue;
                };
                numofrows++;

                String[] endata = line.split(",", 21);

                //for (int index = 0; index < 21; index++) 
               // }
                // add your data to the database as such:

                //db.envData[index] = endata[index];   // <-----UNCOMMENT THIS LINE AND FILL IN
                
            }
            // close your file
            fileRead.close();
            
            Scanner fileRead2 = new Scanner(spfile); 
                // use a loop to read your file
                // keep an index tracker (perhaps a counter?)
                int numofrows2 = 0;
                
                while (fileRead2.hasNext()){
                    line = fileRead2.nextLine();
                    // if the line contains the word "Quadrat" ignore it, since it's a table header
                    if (line.contains("Quadrat")) {
                        continue;
                    };
                    numofrows++;

                    String[] spdata = line.split(",");

                    for (int index = 0; index < spdata.length; index++) {
                        System.out.print(spdata[index]);
                        System.out.print("\n");
                    }
                    // add your data to the database as such:

                    //db.envData[index] = endata[index];   // <-----UNCOMMENT THIS LINE AND FILL IN
                
                // close your file
                fileRead.close();


                }
            } catch (Exception e){
            System.out.println("Error: an unexpected error occured with your file");
            System.exit(1);
            }
        } 

         /*String[] merged = db.mergeTablesBySpecies();

        // Write the merged table to a file
        try{
            PrintWriter out = new PrintWriter("merged.txt");
            // Create a PrintWriter object that will create a file to write the merged array to the file


            for (int i = 0; i < merged.length; i++) {
                out.println(merged[i]);
            }

            // close the PrintWriter
            out.close();
        } catch (Exception e) {
            System.out.println("Something went wrong...");
            System.exit(1);
        }*/
    }   

    