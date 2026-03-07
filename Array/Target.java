public class Target {
    public static int find_target(int n[], int target) {
        int st = 0;
        int end = n.length-1;
        
        while(st <= end) {
            int mid = st + (end - st)/2;
            if(n[mid] == target) {
                return mid;
            }
            if(n[st] <= n[mid]) {
                if(n[st] <= target && target <= n[mid]) {
                    end = mid -1;
                } else {
                    st = mid + 1;
                }              
            }
            else {
                if(n[mid] <= target && target <= n[end]) {
                    st = mid + 1;
                } else {
                    end = mid -1;
                }
            }
        }
        return -1;
            
    }
    public static void main(String[] args) {
        int array[] = {4, 5, 6, 7, 0, 1, 2};
        int key = 0;
        System.out.println(find_target(array, key));
    }
}
