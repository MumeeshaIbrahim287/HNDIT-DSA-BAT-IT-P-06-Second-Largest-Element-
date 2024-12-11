
            import java.util.Arrays;

    public class SecondLargestElement {
        public static void main(String[] args) {
            int[] array = {1, 3, 5, 2, 4};

            // Sort the array using Selection Sort
            selectionSort(array);

            // The second largest element is the second last element in the sorted array
            int secondLargest = array[array.length - 2];

            System.out.println("Second Largest Element: " + secondLargest);
        }

        // Method to perform Selection Sort
        public static void selectionSort(int[] array) {
            int n = array.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Find the index of the smallest element in the unsorted part
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element of the unsorted part
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

