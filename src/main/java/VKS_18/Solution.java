package VKS_18;

import java.util.HashMap;

public class Solution {

    public int romanToInt(String str) {
        HashMap<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int res = roman.get(str.charAt(str.length()-1));
        for(int i=str.length()-2;i>=0;i--){
            if(roman.get(str.charAt(i)) < roman.get(str.charAt(i+1))){
                res -= roman.get(str.charAt(i));
            }else{
                res += roman.get(str.charAt(i));
            }
        }
        return res;
    }
}
