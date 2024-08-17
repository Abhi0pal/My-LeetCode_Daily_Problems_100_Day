class Solution {
    public String intToRoman(int num) {
        String[] sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] val={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder res= new StringBuilder();

        for(int i=0;i<13;i++){
            if(num==0){
                break;
            }
            int times=num/val[i];
            for(int j=0;j<times;j++){
                res.append(sym[i]);
            }
            num=num%val[i];
        }
        return res.toString();

        
    }
}