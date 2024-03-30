public class arrays_in_methods {
    static void change(int a)
    {
        a =98;
    }
    static  void change2(int [] arr)
    {
        arr[0] =98;
    }

    public static void main(String[] args) {
        int [] marks = {66, 77 , 88, 98, 32};
        int x = 45;
        change(x);
        change2(marks);
        System.out.println("the value of x after running change is: "+x);
        System.out.println("the value of marks[o] after running change2 is: "+marks[0]);
    }
}
