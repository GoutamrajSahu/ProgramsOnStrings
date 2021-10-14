
/*
Question:-
Print all tokens of a string separated by Regex [!,?._'@ ].

Example:
Input:-
He is a very very good boy, isn't he?
Output:-
10                       <---------number of tokens
He
is
a
very
very
good
boy
isn
t
he
 */


import java.util.*;
public class StringTokenizer_with_Regex {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer str = new StringTokenizer(s,"[!,?._'@ ]");
        int count = 0;
        ArrayList<String> tokens = new ArrayList<>();
        while(str.hasMoreTokens()){
            count++;
            tokens.add(str.nextToken());
        }
        System.out.println(count);
        for(String ele: tokens){
            System.out.println(ele);
        }
        scan.close();
    }
}
