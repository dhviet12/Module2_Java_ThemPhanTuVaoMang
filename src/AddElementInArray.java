import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] myArray= new int[10];
        Scanner input = new Scanner(System.in);
        int choice=- 1;
        while (choice != 2){
            System.out.println("Add element to Array ");
            System.out.println("Press 1 to add ");
            System.out.println("Press 2 to exit ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter element you want to add:");
                    int addNumber = input.nextInt();
                    System.out.println("Enter index you want to add in array:");
                    int addIndex = input.nextInt();
                    if(addIndex >=0 && addIndex < myArray.length){
                        AddElement(myArray,addNumber,addIndex);
                    }
                    else
                        System.out.println("Invalid index");
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }
    public static void AddElement (int array[],int value, int index){
        for (int i = array.length;i<index;i--){
            array[i]= array[i-1];
        }
        array[index]=value;
        System.out.println(Arrays.toString(array));
    }
}
