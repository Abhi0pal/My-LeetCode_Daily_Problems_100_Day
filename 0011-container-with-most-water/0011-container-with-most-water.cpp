class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.empty()){
            return 0;

        }
        int size=height.size()-1;
        int end=height.size()-1;
        int start=0;
        long long max_area=0;
        while(start<end){
            int min_element=min(height[start],height[end]);
            long long current_area=(long long)min_element*(end-start);
            max_area=max(current_area,max_area);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
            size--;
        }
        return max_area;
        
    }
};