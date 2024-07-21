class Student {
    String name;
    static int counter = 0;

    Student(String n){
        name = n;
        counter ++;
        System.out.println(name + "様、登録完了");
    }

    static void display(){
        System.out.println("登録生徒" + counter + "名");
    }
}
