////11. Convert the following code so that it uses nested while statements instead of for statements:
//class a{
//    public static void main(String[] args) {
//        int s = 0;
//        int t = 1;
//        for (int i = 0; i < 10; i++)
//        {
//            s = s + i;
//            for (int j = i; j > 0; j−−)
//            {
//                t = t * (j - i);
//            }
//            s = s * t;
//            System.out.println("T is " + t);
//        }
//        System.out.println("S is " + s);
//    }
//}



public class Q11 {
    public static void main(String[] args) {
        int s=0, t=1,i=0,j = 0;
        while(i<10){
            s = s + i;
            while(j>0){
                t = t * (j - i);
                j--;
            }
            s = s * t;
            System.out.println("T is " + t);
            i++;
        }
        System.out.println("S is " + s);
    }
}