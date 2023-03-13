//HackerRank Mini-Max Sum Problem Solving. Rewrite to HackerRank // ?????
public class Task14 {
    public static void main(String[] args) {
        int[] array = new int[]{396285104, 573261094, 759641832, 819230764, 364801279};
        int max = 0;
        int total = 0;
        int sum = 0;
        int min = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        //System.out.println(sum);

        for(int j = 0; j < array.length; j++){
            total = sum - array[j];

            if(total > max){
                max = total;
            }else if(total < max){
                min = total;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
