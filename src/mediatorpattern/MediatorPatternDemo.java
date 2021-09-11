package mediatorpattern;

import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  

//This is an interface.  
interface ApnaChatRoom {  
    
  public void showMsg(String msg, Participant p);  

}// End of the ApnaChatRoom interface.  

//This is a class.  
class ApnaChatRoomImpl implements ApnaChatRoom{  
  //get current date time   
  DateFormat dateFormat = new SimpleDateFormat("E dd-MM-yyyy hh:mm a");  
  Date date = new Date();  
  @Override  
  public void showMsg(String msg, Participant p) {  
        
      System.out.println(p.getName()+"'gets message: "+msg);  
      System.out.println("\t\t\t\t"+"["+dateFormat.format(date).toString()+"]");    
  }     
}// End of the ApnaChatRoomImpl class.  

//This is an abstract class.  
abstract class Participant {  
    public abstract void sendMsg(String msg);  
    public abstract void setname(String name);  
    public abstract String getName();  
}// End of the Participant abstract class.  

//This is a class.  

class User1 extends Participant {  
    
  private String name;  
  private ApnaChatRoom chat;  
    
  @Override  
  public void sendMsg(String msg) {  
  chat.showMsg(msg,this);  
        
  }  

  @Override  
  public void setname(String name) {  
      this.name=name;  
  }  

  @Override  
  public String getName() {  
      return name;  
  }  
    
  public User1(ApnaChatRoom chat){  
      this.chat=chat;  
  }     
    
}// End of the User1 class.  

class User2 extends Participant {  

  private String name;  
  private ApnaChatRoom chat;  
    
  @Override  
  public void sendMsg(String msg) {  
  this.chat.showMsg(msg,this);  
        
  }  

  @Override  
  public void setname(String name) {  
      this.name=name;  
  }  

  @Override  
  public String getName() {  
      return name;  
  }  
    
  public User2(ApnaChatRoom chat){  
      this.chat=chat;  
  }  

    
    
}  
public class MediatorPatternDemo {  
    
  public static void main(String args[])  
  {  
        
        ApnaChatRoom chat = new ApnaChatRoomImpl();  
    
        User1 u1=new User1(chat);  
        u1.setname("Ayush Dixit");  
        u1.sendMsg("Hi Dixit! how are you?");  
      
              
        User2 u2=new User2(chat);  
        u2.setname("Sonu Mishra");  
        u2.sendMsg("I am Fine ! You tell?");  
  }  

}// End of the MediatorPatternDemo class.  
