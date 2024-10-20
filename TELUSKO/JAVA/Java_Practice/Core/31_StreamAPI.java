import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class StreamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,9,2,1);

        // for(int i=0; i<nums.size(); i++){
        //     System.out.println(nums.get(i));
        // }

        // for(int n:nums){
        //     System.out.println(n);
        // }

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };

        Consumer<Integer> con = n -> System.out.println(n);

        nums.forEach(con);

        // nums.forEach(n -> System.out.println(n));

        // int sum= 0;
        // for(int n:nums){
        //     if(n%2 ==0){
        //         n *= 2;
        //         sum+=n;
        //     }
        // }
        // System.out.println(sum);

        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(n -> System.out.println(n));
        // we can use stream only once
        
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // s2.forEach(n-> System.out.println(n));

        // Stream<Integer> s3 = s2.map(n-> n*2);
        // s3.forEach(n-> System.out.println(n));

        // int result = s3.reduce(0, (c,e)-> c+e);
        // System.out.println(result);
        
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n) {
                return n%2 == 0;
            }
        };

        Function<Integer,Integer> fun = new Function<Integer,Integer>() {
            public Integer apply(Integer n) {
                return n*2;
            }
        };



        int result = nums.stream()
            .filter(p)
            .map(fun)
            .reduce(0, (c,e)-> c+e);

        System.out.println(result);

        Stream<Integer> sortedValues = nums.parallelStream()
                                            .filter(p)
                                            .sorted();

        sortedValues.forEach(n-> System.out.println(n));                               


    }
}
