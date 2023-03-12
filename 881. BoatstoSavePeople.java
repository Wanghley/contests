

/**
 * @author Wanghley Soares Martins
 * Problem number: 881
 * Problem name: Boats to Save People
 * Problem link: https://leetcode.com/problems/boats-to-save-people/
 */

public class BoatstoSavePeople{
    public int numRescueBoats(int[] people, int limit) {
        int sum=0;
        int boats = 1;
        for (int i = 0; i < people.length; i++) {
            int j = -1;
            sum=0;
            do{
                j+=1;
                sum+=people[i]+people[j];
                if(sum>limit){
                    sum-=people[j];
                }
            }while(sum<=limit);
        }
        return sum;
    }
    public static void main(String[] args) {
        BoatstoSavePeople btsp = new BoatstoSavePeople();
        System.out.println(btsp.numRescueBoats(new int[]{1,2}, 3));
        System.out.println(btsp.numRescueBoats(new int[]{3,2,2,1}, 3));
        System.out.println(btsp.numRescueBoats(new int[]{3,5,3,4}, 5));
    }
}