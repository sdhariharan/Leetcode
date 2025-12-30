public class FindingIndex {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        int target=2;
        int low=0,high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                System.out.println("Insertion Index"+mid);
                break;
            }
            else if(target>low)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        if(arr[mid]!=target)
        System.out.println("Insertion Index:"+low);
    }
    
}
