#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int i = 0,j = 0;
        int count = 0;
        int sum = 0;
        while(j < nums.size()){
            if(sum == k){
                count++;
                sum += nums[j++];
            }
            else if(sum < k){
                sum += nums[j++];
            }
            else{
                sum -= nums[i++];
            }
        }
        return count;
    }
};
int main()
{
    vector<int> nums = {1,3,4,3,1};
    Solution s;
    cout<<s.subarraySum(nums,4);

    return 0;
}