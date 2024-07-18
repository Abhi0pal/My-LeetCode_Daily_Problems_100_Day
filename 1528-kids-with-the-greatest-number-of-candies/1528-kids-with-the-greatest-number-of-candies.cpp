class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
      vector<bool>vc(candies.size());
      int maxi=0;
      for(int i=0;i<candies.size();i++){
        if(candies[i]>maxi){
            maxi=candies[i];
        }
      }
      for(int i=0;i<candies.size();i++){
        int ele=candies[i]+extraCandies;
        if(ele>=maxi){
            vc[i]=1;
        }
        else{
             vc[i]=0;
        }
      }  
      return vc;
    }
};