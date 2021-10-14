import java.util.Arrays;
import java.util.Scanner;

public class Checking_Anagrams {
    static boolean isAnagram(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        char[] arrayOfa = a.toCharArray();
        char[] arrayOfb = b.toCharArray();
        Arrays.sort(arrayOfa);
        Arrays.sort(arrayOfb);

        if(a.length() != b.length()){
            return false;
        }
// Without Arrays.equals() method:-
        for(int i = 0; i < a.length(); i++){
            if(arrayOfa[i] != arrayOfb[i]){
                return false;
            }
        }
//        ......or...... With Arrays.equals() method:-
//        if(Arrays.equals(arrayOfa,arrayOfb) == false){
//            return false;
//        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
