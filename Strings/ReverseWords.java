public class ReverseWords {
    public String reverseWords(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        char temp;
        for(int end=0;end<=arr.length;end++)
        {
            int right=end-1;
            if(end==arr.length||arr[end]==' ')
            {
                while(left<right)
                {
                temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right--;
                }
                left=end+1;
            }
        }
        return new String(arr);
    }
}
