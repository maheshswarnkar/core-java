
public class IntegerArray {

    public static void main(String[] args) {
        
        int[] arrayOfInteger = {2,3,2,3,4,1,5,1};
        int[] secondArray = new int[arrayOfInteger.length];
        int[] thirdArray = new int[arrayOfInteger.length];
        
        for (int i = 0; i < arrayOfInteger.length; i++) {
            int counter = 0;
            int element = arrayOfInteger[i];
            
            for (int j = i+1; j < arrayOfInteger.length; j++) {
                if( arrayOfInteger[i] == arrayOfInteger[j] && counter !=1) {
                    secondArray[i] = element;
                    counter = 1;
                }
            }
        }
        System.out.println("Without duplicate element array is ");
        
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]+", ");
        }
        

    }

}
