
public class ListDriver{
    public static void main(String[] args){
        GenericList<String> glist = new GenericList<>(10);

        glist.add("milk");
        glist.add("eggs");
        System.out.println(glist);


        GenericList<Integer> numbers = new GenericList<> (10);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
    }
}
