// 기초 수학 - 지수와 로그

public class Main {

    public static void main(String[] args) {

//      1. 제곱, 제곱근, 지수
        System.out.println("== 제곱 ==");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(2,-3));
        System.out.println(Math.pow(-2,-3));
        System.out.println(Math.pow(2,30));
        System.out.printf("%.0f\n",Math.pow(2,30));

        System.out.println("== 제곱근 ==");
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(16,1.0/2));
        System.out.println(Math.pow(16,1.0/2));
//      참고) 절대 값
        System.out.println("== 절대 값 ==");
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));


//      2. 로그
        System.out.println("== 로그 ==");
        System.out.println(Math.E);
        System.out.println(Math.log(2.718281828459045));
        System.out.println(Math.log10(1000));
        System.out.println(Math.log(4)/Math.log(2));
    }
}



// Practice
// 제곱과 제곱근을 Math 없이 구현하기

public class Practice {

    static double pow(int a, double b){
        double result =1;
        boolean isMinus = false;
        if(b==0){
            return 1;

        }else if(b<0){
            b*=-1;
            isMinus=true;
        }
        for (int i = 0; i < b; i++) {
        result *=a;
        }
        return isMinus? 1/result:result;
    }

    //sqrt 중요!!
            static double sqrt(int a){
        double result =1;
                for (int i = 0; i < 10; i++) {
                    result = (result+(a/result))/2;

                }

        return result;
            }

    public static void main(String[] args) {

//      Test code
        System.out.println("== Math pow ==");
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, -3));
        System.out.println(Math.pow(-2, -3));

        System.out.println("== My pow ==");
        System.out.println(pow(2, 3));
      System.out.println(pow(2, -3));
      System.out.println(pow(-2, -3));

        System.out.println("== Math sqrt ==");
        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(8));

        System.out.println("== My sqrt ==");
        System.out.println(sqrt(16));
        System.out.println(sqrt(8));

    }
}


