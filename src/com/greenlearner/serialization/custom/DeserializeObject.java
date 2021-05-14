package com.greenlearner.serialization.custom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author - GreenLearner(https://www.youtube.com/c/greenlearner)
 */
public class DeserializeObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("arvind12345.txt");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        //read the object
        Employee employee = (Employee) ois.readObject();
        System.out.println("Deserialized emp - " + employee);

        fis.close();
        ois.close();
    }
}

//Actual emp - Employee{id=101, name='Arvind', address='Noida', category='TEMP', department='IT', listOfTask='[task1, task2]', scores='[1, 2, 4, 5]'}