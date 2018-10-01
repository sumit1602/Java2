//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
public class Q3 {
    public static void main(String[] args) {
        try{

            calculator c= new calculator();
        }
        catch (Throwable t){
            System.out.println(t);
        }
        //Exception in thread "main" java.lang.NoClassDefFoundError: Could not initialize class calculator

        calculator c1= new calculator();
    }
}
class calculator{
    static int j=1/0;
}