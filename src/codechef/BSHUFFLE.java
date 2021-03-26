package codechef;

import java.util.*;
import java.util.Random;

public class BSHUFFLE {
    /*public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i=0; i<n; i++){
            arr.add(i+1);
        }
        if (n==1){
            System.out.println(1);
            System.out.println(1);
        }
        else{
            HashMap<String, Long> hash = new HashMap<>();
            for (int k=0; k<2000000; k++){
                List<Integer> arrdup = new ArrayList<>(arr);
                for (int i=0; i<n; i++){
                    Random rand = new Random();
                    int  j = rand.nextInt(n)+0;
//                    int j = (int )(Math.random() * (n) + 0);
                    int temp = arrdup.get(j);
                    arrdup.set(j, arrdup.get(i));
                    arrdup.set(i, temp);
                    //System.out.println( count+1 + ". j1="+ i + " j2=" + j + "-> " + arrdup);
                }
                StringBuilder strbul  = new StringBuilder();
                Iterator<Integer> iter = arrdup.iterator();
                while(iter.hasNext())
                {
                    strbul.append(iter.next());
                    if(iter.hasNext()){
                        strbul.append("");
                    }
                }
                strbul.toString();
                if (hash.containsKey(strbul.toString())){
                    hash.put(strbul.toString(),hash.get(strbul.toString())+1);
                }
                else
                    hash.put(strbul.toString(), (long) 1);
            }
            long max = Long.MIN_VALUE, min = Long.MAX_VALUE;
            String arrmax = null;
            String arrmin = null;
            int tempcount = 0;
            for (Map.Entry<String, Long> entry : hash.entrySet()) {
                String key = entry.getKey();
                long value = entry.getValue();
//                System.out.println(tempcount+1 + "=> " + key + " Prob: " + (value));
                tempcount++;
                if (value > max){
                    max = value;
                    arrmax = key;
                }
                else if (value < min){
                    min = value;
                    arrmin = key;
                }
            }
            for (int i=0; i<arrmax.length(); i++){
                System.out.print(arrmax.charAt(i) + " ");
            }
            System.out.println();
            for (int i=0; i<arrmin.length(); i++){
                System.out.print(arrmin.charAt(i) + " ");
            }
            System.out.println();
        }
    }*/
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N==1)
        {
            System.out.println("1");
            System.out.println("1");
        }
        else
        {
            for(int i=2;i<=(N/2);i++)
                System.out.print(i+" ");
            System.out.print(1+" ");
            for(int i=(N/2+2);i<=N;i++)
                System.out.print(i+" ");
            System.out.print(((N/2)+1)+" ");
            System.out.println();
            System.out.print(N+" ");
            for(int i=1;i<=N-1;i++)
                System.out.print(i+" ");
        }
    }
}
