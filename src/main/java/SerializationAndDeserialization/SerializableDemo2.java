package SerializationAndDeserialization;

import java.io.*;

class Dog1 implements Serializable {

	Cat c = new Cat();

}

class Cat implements Serializable {
	Rat r = new Rat();

}

class Rat implements Serializable {
	int j = 20;

}

 class SerializableDemo2 {

	public static void main(String[] args) {

		try {
			Dog1 d1 = new Dog1();

			FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog1 d2 = (Dog1) ois.readObject();

			System.out.println(d2.c.r.j);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
