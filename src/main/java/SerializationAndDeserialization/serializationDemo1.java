package SerializationAndDeserialization;

import java.io.*;

class Dog implements Serializable {

	// public static final long SeraialVersionUID = 1L;

	int i = 10;
	int j = 20;
//	transient int j = 20;


}

public class serializationDemo1 {

	public static void main(String[] args) {
		Dog d1 = new Dog();

		try {

			// serialization
			FileOutputStream fos = new FileOutputStream("abc.ser");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(d1);

			// De-serialization

			FileInputStream fis = new FileInputStream("abc.ser");

			ObjectInputStream ois = new ObjectInputStream(fis);

			Dog d2 = (Dog) ois.readObject();

			System.out.println(d2.i + "...." + d2.j);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
