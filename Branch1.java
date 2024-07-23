class Branch1{
    public static void main(String[] args){
        int price = Integer.parseInt(args[0]);
        double rate = 0.1;

        int discount, amount;

        if (price >= 7000){
            discount = 1000;
        }else if(price >= 3000){
            discount = 300;
        }else{
            discount = 0;
        }
        System.out.println("割引額は" + discount + "円です");
         amount = (int)((price - discount) * (1 + rate));

         /*double discountRate;
         if(price >= 3000){
            discountRate = 0.1;
         }else{
            discountRate = 0;
         }
         System.out.println("割引額は" + (int)(price * discountRate) + "円です");
         int amount = (int)((price * (1 - discountRate) * (1 + rate)));*/
        
         
         System.out.println("料金は" + amount + "円です");
    }
}