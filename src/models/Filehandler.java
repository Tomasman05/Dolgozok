package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Filehandler {
    final String filename = "dolgozok.txt";
    ArrayList<Employee> emplist = null;
    public ArrayList<Employee> readFile(){
        try {
            emplist = tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Nem létezik a file.");
            System.err.println(e.getMessage());
        }
        return emplist;
    }
    public ArrayList<Employee> tryReadFile() throws FileNotFoundException{
        ArrayList<Employee> emplist = new ArrayList<>();
        File file = new File(filename);
        Scanner sc = new Scanner(file, "utf-8");
        while(sc.hasNextLine()){
            Employee emp = new Employee();
            String line = sc.nextLine();
            String [] lineArray = line.split(":");
            emp.id = Integer.parseInt(lineArray[0]);
            emp.name = lineArray[1];
            emp.city = lineArray[2];
            emp.address = lineArray[3];
            emp.salary = Double.parseDouble(lineArray[4]);
            emp.birthDate = LocalDate.parse(lineArray[5]);
            emplist.add(emp);
        }
        sc.close();
        return emplist;
    }
}
