/*
Question: Check a given IP address is correct or not using Regular Expression. If correct output will true else false.

Example:
Inputs:
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Outputs:
true
true
true
false
false
false

*/

import java.util.Scanner;

class Regex_to_Detect_Correct_IP_Address{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
    }
}
class MyRegex{
    String pattern = "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0[0-9][0-9]|[0-9][0-9]|[0-9])[.](25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0[0-9][0-9]|[0-9][0-9]|[0-9])[.](25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0[0-9][0-9]|[0-9][0-9]|[0-9])[.](25[0-5]|2[0-4][0-9]|1[0-9][0-9]|0[0-9][0-9]|[0-9][0-9]|[0-9])";
}
