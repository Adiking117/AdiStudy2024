import java.util.*;

class CollectionAPI {
    public static void main(String[] args) {

        // Lists
        List<Integer> nums = new ArrayList<Integer>();
        // by default it stores object type

        Comparator<Integer> com = new Comparator<Integer>() 
        {
            public int compare(Integer i,Integer j){
                if(i%10 > j%10)
                    return 1;
                else    
                    return -1;
            }
            // logic to sort array on the last number
        };

        nums.add(65);
        nums.add(56);
        nums.add(71);
        nums.add(34);

        Collections.sort(nums,com);
        // Collection is name of class and sort is its method

        // System.out.println(nums.get(2));

        for( int n : nums){
            System.out.println(n);
        }
        // System.out.println(nums);


        // Sets
        Set<Integer> nums1 = new HashSet<Integer>();
        // Set<Integer> nums1 = new TreeSet<Integer>(); // it will store in sorted manner
        nums1.add(6);
        nums1.add(5);
        nums1.add(7);
        nums1.add(3);
        nums1.add(6); // it cannot store duplicate values it will get add tho


        // for( int n : nums1){
        //     System.out.println(n);
        // }

        // Iterator<Integer> values = nums.iterator();

        // while(values.hasNext())
        //     System.out.println(values.next());



        // Maps

        Map<String,Integer> students = new HashMap<String,Integer>();
        // Map<String,Integer> students = new Hashtable<String,Integer>(); //used when multiple threads

        students.put("Adiking", 90);
        students.put("Pranav", 68);
        students.put("Tirht", 80);
        students.put("PArth",34);
        students.put("Adiking",91); // will update but not repeated 

        // System.out.println(students.get("Adiking"));
        // System.out.println(students.keySet());

        // for(String n:students.keySet()){
        //     System.out.println(n+" "+students.get(n));
        // }

    }
}
