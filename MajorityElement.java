public class MajorityElement {
    public static void main(String[] args) {
        int[] arr={ 2,2,1,1,2,2,1};
        int count=0;
        int win=0;
        for(int i=0;i<arr.length;i++)
        {
            if(count==0)win=arr[i];
            count+=(arr[i]==win)?1:-1;
        }
        System.out.println("Majority Element:"+win);
    }
    
}
