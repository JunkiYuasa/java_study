class StudentBug {
    String name;
    int counter = 0;

    StudentBug(String n){
        name = n;
        counter ++;
        System.out.println(name + "様、登録完了");
    }

    void display(){
        System.out.println("登録生徒" + counter + "名");
    }
}
