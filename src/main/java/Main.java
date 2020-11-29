/* *
 * https://apfstatic.s3.ap-south-1.amazonaws.com/s3fs-public/08_comac_rascal_triangle.pdf
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File myFile = new File("RascalsTriangleSampleInput.txt");
            Scanner myReader = new Scanner(myFile);
            RascalsTriangle rascalTriangle = new RascalsTriangle();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] input = data.split(" ");
                if(input.length < 2) {
                    continue;
                }
                int listNumber = Integer.parseInt(input[0]);
                int row = Integer.parseInt(input[1]);
                int index = Integer.parseInt(input[2]);
                int val = rascalTriangle.rascalTriangleFormula(row,index);
                System.out.println(listNumber + " " + val);

            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }



}
