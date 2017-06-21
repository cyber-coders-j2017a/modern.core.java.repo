package Numbers1;

/**
 * Created by LewisMonplaisir on 18/06/2017.
 */
public class LargestSmallestNumber {

    public static void main(String[] args) {
        int numbers[] = new int[]{32, 43, 53, 54, 65, 63, 67, 98, 43, 33};

        int smallest = numbers[0];
        int largest = numbers[0];
        
        for(int i=1; i<numbers.length; i++){

            if(numbers[i]>largest)
                largest = numbers[i];
            else if(numbers[i]<smallest)
                smallest = numbers[i];

            System.out.println("Largest Number is: " + largest);
            System.out.println("Smallest Number is: " + smallest);
        }
    }
}
