public class Main {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 30; i++) {
            System.out.println("Hello world!");
            Thread.sleep(1000);


            System.out.println(" Array first class");

            int [] arr={10,20,30,40,50};
            System.out.println(arr[4]);
            // Can we print two numbes from an array
            System.out.println(arr[1]+" "+arr[4]);
            // print all the elements from this array using a loop

            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i]);
            }
            System.out.println("*************");
            // Enhanced/foreach for loop
            // when ever possible use below loop
            for(int number:arr){
                System.out.println(number);
            }


        }
    }
}