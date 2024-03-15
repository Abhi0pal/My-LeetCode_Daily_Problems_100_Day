/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
         
        if(head==NULL){
            return false;
        }
        //created a map for valuse pair of
        map<ListNode*,bool>mymap;

        while(head!=NULL){
            //herenote
            if(mymap[head]==true){
                return true;
            }
            mymap[head]=true;
            //now its a time to upadate the head
            head=head->next;
        }
        return false;
        
    }
};