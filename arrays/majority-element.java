package arrays;


class Solution {
    public static int majorityElement(int arr[]) {
        // code here
        int n=arr.length;
        int count=0;
        int maj=arr[0];
        for(int num:arr){
            if(count==0){
                maj=num;
                count++;
            }
            else if(num==maj){
                count++;
            }
            else{
                count--;
            }
        }
        count=0;
        for(int i:arr){
            if(i==maj){
                count++;
            }
        }
        return (count>n/2) ? maj:-1;
    }
}