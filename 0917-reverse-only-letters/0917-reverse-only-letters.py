class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        l1=list(s)
        l=0
        r=len(l1)-1
        while l<r:
            if not l1[l].isalpha():
                l+=1
                continue
            if not l1[r].isalpha():
                r-=1
                continue
            temp=l1[l]
            l1[l]=l1[r]
            l1[r]=temp
            l+=1
            r-=1
        return "".join(l1)