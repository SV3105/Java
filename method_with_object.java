public class method_with_object {

         int logic(int x, int y)
        {
            int z;
            if (x > y) {
                z = x + y;
            } else {
                z = (x + y) * 5;
            }
            return z;
        }
        public static void main(String[] args)
        {
            int a=5;
            int b=7;
            int c;
            method_with_object obj = new method_with_object();
            c = obj.logic(a,b);
            System.out.println(c);
        }
    }
