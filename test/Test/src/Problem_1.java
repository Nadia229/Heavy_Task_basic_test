import java.util.Arrays;
class Problem_1{
	
static int find(int arr[], int left,
                       int right, int diff)
{
 
	//doing a binary search
    
    if (right <= left)
        return 0;
    int mid = left + (right - left) / 2;
 
    if (arr[mid + 1] - arr[mid] != diff)
        return (arr[mid] + diff);
 
    if (mid > 0 &&
        arr[mid] - arr[mid - 1] != diff)
        return (arr[mid - 1] + diff);
    
    if (arr[mid] == arr[0] + mid * diff)
        return find(arr, mid + 1, right, diff);
 
   return find(arr, left,mid - 1, diff);
}
 
static int missing(int arr[], int n)
{
 
    Arrays.sort(arr);
    int diff = (arr[n - 1] - arr[0]) / n;
    
    return find(arr, 0, n - 1, diff);
}
 

public static void main(String[] args)
{
  
    int arr[] = new int[]{9 ,18 ,6 ,3 ,12};
    int n = arr.length;
    
 
    System.out.println(missing(arr, n));
}
}