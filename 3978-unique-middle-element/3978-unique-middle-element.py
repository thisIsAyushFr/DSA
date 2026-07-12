class Solution:
    def isMiddleElementUnique(self, nums: list[int]) -> bool:
        m = nums[(len(nums))//2]
        c=0
        for i in nums:
            if m==i:
                c+=1
        return c==1