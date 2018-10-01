public class Q3ClassNotFoundException {
    public static void main(String[] args) {
        try{

            //java.lang.ClassNotFoundException because there is no such class present
            Class.forName("java.java");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();;
        }
        school emp1 =new school();
        emp1.hi();
    }
}
class school{
    void hi(){
        System.out.println("hi");
    }
}