class Solution {
public:
    int rangeBitwiseAnd(int left, int right) {
    while (left < right) {
        // Remove the rightmost bit set to 1 in right
        right = right & (right - 1);
    }
    return left & right;
}

};