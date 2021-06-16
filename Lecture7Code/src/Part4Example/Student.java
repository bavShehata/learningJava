package Part4Example;

import java.io.*;

public class Student implements Serializable {

    String name;
    int id;
    static int count = 0;
    transient String password;

    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        count++;
    }
    ////////////////////////////////////////////////////////////////////
    private void writeObject(ObjectOutputStream o) throws IOException {
        o.writeUTF(name);
        o.writeInt(count);
    }
    ////////////////////////////////////////////////////////////////////
     private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException 
    {       
        name = aInputStream.readUTF();
        count = aInputStream.readInt();        
    }
     /////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", password=" + password + " count =" + count + '}';
    }

}
