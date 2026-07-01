public class maxavg {
     public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+nums[i];
        }
        max=sum;

        for(int j=k;j<nums.length;j++)
        {
          sum=sum+nums[j]-nums[j-k];
          max=Math.max(max,sum);
        }
        double avg=(double)max/k;
        return avg;

    }
}
