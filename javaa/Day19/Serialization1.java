//serializable-fileoutputstream
//DeSerializable-fileinputStream
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Student implements Serializable{
    String name;
    int mark;
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{

    public CustomObjectOutputStream(OutputStream objStream) throws IOException {
        super(objStream);
    }
    @Override
    protected void writeStreamHeader(){ //to prevent creation of header

    }
    
}
public class Serialization1 {
    public static void main(String[] args) throws IOException{
        Student s=new Student("yyy",44);
        //FileOutputStream fo=new FileOutputStream("student.txt",true);//file open
        //true is used to create separet object(deserializable cannot happend)
        //true use for(name change (xxx to yyy))
        //ObjectOutputStream objectStream=new ObjectOutputStream(fo);//object to byte stream
        // objectStream.writeObject(s);//writing on file
        // fo.close();
        // objectStream.close();

        File file=new File("student.txt");
        FileOutputStream fo=new FileOutputStream(file,true);

        ObjectOutputStream objStream;
        if(file.length()==0){
            objStream=new ObjectOutputStream(fo);//first time serializing
        }else{
            objStream=new CustomObjectOutputStream(fo);//appending to the existing serialization file
        }
        objStream.writeObject(s);//writing on file
        fo.close();
        objStream.close();

    }
}
