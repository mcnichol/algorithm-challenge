import java.net.URL;

public class ArrayDisp{

    static <T> void Display(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main (String[] args){

        URL resource = ArrayDisp.class.getClassLoader().getResource();

        String[] names = new String[10];
        names[0] = "David";
        names[1] = "1David";
        names[2] = "2David";
        names[3] = "3David";
        names[4] = "4David";
        names[5] = "5David";
        names[6] = "6David";
        names[7] = "7David";
        names[8] = "8David";
        names[9] = "9David";

        Display(names);

        Integer[] numbers = new Integer[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println();
        Display(numbers);
        System.out.println();
    }
}
