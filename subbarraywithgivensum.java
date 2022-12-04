public class subbarraywithgivensum {
    public static void main(String[] args)
    {
        // Create a Scanner to read input from the command line
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Prompt the user to enter the elements of the array
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        // Prompt the user to enter the target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Find the subarray with the given sum
        int start = -1;
        int end = -1;
        for (int i = 0; i < size; i++)
        {
            int sum = 0;
            for (int j = i; j < size; j++)
            {
                sum += arr[j];
                if (sum == target)
                {
                    start = i;
                    end = j;
                    break;
                }
            }
        }

        // Print the subarray with the given sum
        if (start == -1 || end == -1)
        {
            System.out.println("Subarray with given sum not found");
        }
        else
        {
            System.out.println("Subarray with given sum found at index " + start + " to " + end);
        }
    }
}

