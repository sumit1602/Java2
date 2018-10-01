import java.lang.String;
public class Q2SortingString {
    public static void main(String[] args) {
        String str = "ddecaf";

        char[] ch = str.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            for (int j = 0; j < ch.length; j++) {
//                if (ch[i] < ch[j]){
//                    char temp=ch[i];
//                    ch[i]=ch[j];
//                    ch[j]=temp;
//                }
//            }
//        }
//        for(int k=0; k<ch.length; k++)
//            System.out.println(ch[k]);

        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length-1; j++) {

                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
            System.out.print(ch[i]);
        }
    }
}