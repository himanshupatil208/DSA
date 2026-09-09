class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int temp=0;
        System.out.println(n);
        for(int i=0;i<citations.length;i++)
            System.out.print(citations[i]+" ");
        for(int i=0;i<n;i++){
            if(citations[i]>=(n-i)){
                temp=Math.max(temp,n-i);
            }
        }


        return temp;
    }
}