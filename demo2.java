public class Aryaman{
    String Name;
    int age;
    static void setName(String name){
        this.Name = name;
        
    }
    static String getName(){
        return Name;
    }
    
}
public class Main{
    public static int main(String [] args){
        System.out.println("My name is aryaman");
        Aryaman me = new Aryaman();
        
    }
}
