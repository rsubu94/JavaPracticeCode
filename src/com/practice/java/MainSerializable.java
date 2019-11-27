package com.practice.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerializable {
	public static void main(String[] args) {
		SerializableEx serializableEx = new SerializableEx(1, "Serializable Class","first");
		
		try {
//			FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\test.txt"));
//			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//			objectOutputStream.writeObject(serializableEx);
//			objectOutputStream.close();
			
			FileInputStream fileInputStream = new FileInputStream(new File("E:\\test.txt"));
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			SerializableEx serializableEx2 = (SerializableEx) objectInputStream.readObject();
			System.out.println("ID "+serializableEx2.getId());
			System.out.println("Name "+serializableEx2.getClasss());
//			System.out.println("Name "+serializableEx2.getNewVar());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
