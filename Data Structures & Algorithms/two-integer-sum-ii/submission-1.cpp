class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector<int> res;
        int n=numbers.size();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    res.push_back(numbers[i]);
                    res.push_back(numbers[j]);
                    return {i+1,j+1};
                }
            }
        }
        return {};
    }
};