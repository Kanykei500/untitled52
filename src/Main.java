import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
       ArrayList<Integer>arrayList2=new ArrayList<>();
       ArrayList<Integer>arrayList3=new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int number=(random.nextInt(1, 100));
            arrayList1.add(number);
            if (number%2==0){
                arrayList2.add(number);
            }else {
                arrayList3.add(number);
            }




        }
        System.out.println(arrayList1);
        System.out.println("_______________________");
        System.out.println(arrayList2);
        System.out.println("________________________");
        System.out.println(arrayList3);



    }
}
