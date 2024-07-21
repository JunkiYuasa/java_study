class Loop3 {
    public static void main(String[] args){
        int score[] = new int[3];

        score[0] = 80;
        score[1] = 100;
        score[2] = 30;

        String name[] = {"湯浅","長島","その他"};
        int total = 0;
        
        for( int i = 0 ; i < 3 ; i ++ ){
            System.out.println(name[i] + ":" + score[i] + "点");
            total += score[i];
        }
        System.out.println("受験者数:" + name.length + "名");
        System.out.println("平均点:" + total / score.length + "点");
    }
}