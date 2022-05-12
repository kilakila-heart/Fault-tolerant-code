public class 运算符截断 {
    public static void main(String[] args) {
        int i = 10;
        if (true | ++i > 0) { //没有截断
            System.out.println(i);
        }

        int j = 10;
        if (true || ++j > 0) {//表达式执行有截断
            System.out.println(j);
        }
    }

}
