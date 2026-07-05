class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        l=0
        r=len(nums)-1
        l1=[]
        while l<=r:
            if nums[l]**2 > nums[r]**2:
                l1.append(nums[l]**2)
                l+=1
            else:
                l1.append(nums[r]**2)
                r-=1
        return l1[::-1]