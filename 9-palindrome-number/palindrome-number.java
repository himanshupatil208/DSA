class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int temp=x;
        int a=0;
        while(temp!=0){
            a=10*a+temp%10;
            temp=temp/10;
        }
        System.out.println(a);
        return x==a;
    }
}