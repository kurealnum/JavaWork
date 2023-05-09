package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class Deserialize {
    public static void main(String [] args) {
	   
        User user = null;
            
        FileInputStream fileIn;
          try {
              fileIn = new FileInputStream("C:\\Users\\Cakow\\eclipse-workspace\\SerializeDemo\\employee.ser");
               ObjectInputStream in = new ObjectInputStream(fileIn);
               user = (User) in.readObject();
               in.close();
               fileIn.close();
            
          } catch (FileNotFoundException e) {
              e.printStackTrace();
          } catch (IOException e) 
              e.printStackTrace();
          } catch (ClassNotFoundException e) {
              e.printStackTrace();
          }
  
        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: "+serialVersionUID);
            
        System.out.println("name: " + user.name);
        System.out.println("password: " + user.password);
  
        user.hello();
        
     
  }
}
