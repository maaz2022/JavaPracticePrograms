public class SearchInsertPosition {
    public static int searchPosition(int arr[], int target) {
        int low = 0; // Initialize low with 0
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                return mid; // Return the index where target is found
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low; // Return the position to insert target
    }
    public static void main(String[] args) {
        int[]arr={1,3,5,7};
        int result = searchPosition(arr,5);
        System.out.println(result);
    }
}
