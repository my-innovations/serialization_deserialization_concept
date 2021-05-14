package com.greenlearner.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	
        //read the object
        File file = new File("arvind1234.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee employee = (Employee) ois.readObject();
        System.out.println("Deserialized emp - " + employee);
        ois.close();
        //Actual emp - Employee{id=101, name='Arvind', address='Noida', category='TEMP', department='IT', listOfTask='[task1, task2]', scores='[1, 2, 4, 5]'}
    }
}
