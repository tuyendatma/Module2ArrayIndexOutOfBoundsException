import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=rd.nextInt(100);
            System.out.print(arr[i]+",");
        }
        return arr;
    }

}
