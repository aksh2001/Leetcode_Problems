 
class Solution {
    public void printArray(int[] array){
        for(int i =0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }
    public int[] plusOne(int[] digits) {

        boolean allNine = true;;

        for(int i =0; i < digits.length; i++){
            if(digits[i]!=9){
                allNine = false;
                break;
            } 
        }
        if(allNine){
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            for(int i = 1; i<digits.length+1;i++){
                arr[i] = 0;
            }
            printArray(arr);
            return arr;
        }
        int i = digits.length-1;
        while(i>=0){
            if(digits[i]!=9){
                digits[i]++;
                printArray(digits);
                return digits;
            }
            else{
                digits[i] = 0;
            }
            i--;

        }

        
        return digits;
        
        

    }

    public static void main(String[] args){
        Solution obj = new Solution();

        int[] arr = {8,9,9,9};
        System.out.println(obj.plusOne(arr));
    }
}