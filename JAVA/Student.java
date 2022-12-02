import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
class Student{
static Scanner s=new Scanner(System.in);
public static void main(String[] args) throws IOException{
    FileOutputStream fos=new FileOutputStream("new.txt");
    DataOutputStream dos=new DataOutputStream(fos);
    String p;
    do{
        System.out.println("enter name");
        String name=s.next();
        System.out.println("enter roll");
        int roll=s.nextInt();
        System.out.println("enter faculty");
        String faculty=s.next();
        dos.writeUTF(name);
        dos.writeInt(roll);
        dos.writeUTF(faculty);
        System.out.println("press n to exit or any other to continue");
        p=s.next().toLowerCase();
    }
    while(!p.startsWith("n"));
    dos.close();
    fos.close();
}

    
}