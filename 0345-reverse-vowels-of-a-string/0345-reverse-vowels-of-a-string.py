class Solution:
    def reverseVowels(self, s: str) -> str:
        l1=list(s)
        l=0
        r=len(l1)-1
        while l<r:
            if l1[l].lower() not in "aeiou":
                l+=1
                continue
            if l1[r].lower() not in "aeiou":
                r-=1
                continue
            temp=l1[l]
            l1[l]=l1[r]
            l1[r]=temp
            l+=1
            r-=1
        return "".join(l1)