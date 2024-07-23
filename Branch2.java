class Branch2{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);

        switch(num){
            case 1 :
            System.out.println("8400円です");
            break;
            case 2 :
            System.out.println("100円です");
            //break;
            default:
            System.out.println("1:男　2:女");
        }

    }
}