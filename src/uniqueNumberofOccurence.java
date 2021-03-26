import java.util.*;

public class uniqueNumberofOccurence {
    public static boolean uniqueOccurrences(int[] arr) {
        boolean flag =true;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for (Map.Entry mapElement : map.entrySet()) {
            int value = ((int)mapElement.getValue());
            list.add(value);
        }
        //System.out.println("Sorted list: " + list);
        Collections.sort(list);

        for(int i=1; i<list.size(); i++){
            if (list.get(i) == list.get(i-1)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String  input = scanner.next();
        String[] arrOfStr = input.substring(1,input.length()-1).split(",");
        int[] arr = new int[arrOfStr.length];
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(arrOfStr[i]);
        }
        //System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println(uniqueOccurrences(arr));
    }
}
