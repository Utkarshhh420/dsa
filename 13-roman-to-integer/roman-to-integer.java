class Solution {
    public int romanToInt(String s) {
       int val[] ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
       String rom[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       int value  = 0;
       for(int pos = 0;pos < rom.length;pos++){
        while(s.startsWith(rom[pos])){
            value += val[pos];
            s = s.substring(rom[pos].length());

        }
       }
       return value;
    }
}