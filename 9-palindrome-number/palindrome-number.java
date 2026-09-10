class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x/10==0)
            return true;
        int temp=x;
        int a=0;
        while(temp!=0){
            a=10*a+temp%10;
            temp=temp/10;
        }
        System.out.println(a);
        if(x==a)
            return true;
        else return false;
    }
}