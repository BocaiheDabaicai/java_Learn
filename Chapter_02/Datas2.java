package Chapter_02;
/**
 * 浮点型
 * */
public class Datas2 {
    public static void main(String[] args) {
        // 求圆的面积
        double PI = 3.14;
        double raduis1 = 1.2;
        double raduis2 = 2.5;
        int raduis3 = 6;

        System.out.println("area is : " + PI * raduis1 * raduis1);
        System.out.println("area is : " + PI * raduis2 * raduis2);
        System.out.println("area is : " + PI * raduis3 * raduis3);

        // 温度转换
        double temprature = 80.0;
        double result = (temprature-32.0)/1.8;
        System.out.println("The result is "+result+"℉,temprature is "+temprature+"℃");
    }
}
