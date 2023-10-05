class Solution{
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10==0){
            return 100-purchaseAmount;
        }else{
            int decimal = purchaseAmount%10;
            if(decimal>=5){
                return 100-(purchaseAmount+10-purchaseAmount%10);
            }else{
                return 100-(purchaseAmount-purchaseAmount%10);
            }
        }
    }
    public static void main(String[] args) {
        int value = 15;
        Solution s = new Solution();
        System.out.println(s.accountBalanceAfterPurchase(value));
    }
}