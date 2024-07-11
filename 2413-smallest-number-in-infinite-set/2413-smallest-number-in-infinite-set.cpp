class SmallestInfiniteSet {
public:
    vector<bool>vc;
    
    int i;
    SmallestInfiniteSet() {
        vc=vector<bool>(1001,true);
        i=1;
              
    }
    
    int popSmallest() {
        int result=i;
        vc[i]=false;
        for(int j=i+1;j<1001;j++){
            if(vc[j]==true){
                i=j;
                break;
            }
        }
        return result;
    }
    
    void addBack(int num) {
        vc[num]=true;
        if(num<i){
            i=num;
        }
        
    }
};

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet* obj = new SmallestInfiniteSet();
 * int param_1 = obj->popSmallest();
 * obj->addBack(num);
 */