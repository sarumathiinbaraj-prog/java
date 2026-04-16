import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeSerialization1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fi=new FileInputStream("student.txt");
        ObjectInputStream objStream=new ObjectInputStream(fi);
        // Student s=(Student)objStream.readObject();//final answel only print
        // System.out.println(s.name+" "+s.mark);
        while(true){//all changes print
            try {
                Student s=(Student)objStream.readObject();
                System.out.println(s.name+" "+s.mark);
            } catch (EOFException e) {
                break;
            }
        }
        fi.close();
        objStream.close();
        
    }
}
