public class remove_duplicate_elemenet {
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int k=1;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                
                arr[k]=arr[i];
                k++;
            }
        }
        System.out.println("Unique element in array:"+k);
    }
    
}
