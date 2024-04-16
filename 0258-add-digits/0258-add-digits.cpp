class Solution {
public:
    int sum=0;
    int CountOfDigits(int num){
        
        int count=0;
        sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
            count++;
        }
        return count;
        
    }
    int addDigits(int num) {
        // int count=0
        while(CountOfDigits(num)>1){
            num=sum;
        }
        return sum;
    }
};