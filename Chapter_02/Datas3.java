package Chapter_02;
/**
 * 浮点型
 * */
public class Datas3 {
    public static void main(String[] args) {
        float a = 3.14f;

        byte b = 3;
        int c = b+2;

        // 1 2
        int i = 1;
        // i:2 3 4
        // 1 + 3 * 3
        int j = i++ + ++i * i++;
        System.out.println(" "+j);
    }
}
