public class Main
{
    public static void main(String[] args){
        Container container = new Container();
        container.count += 7843;
        //не знаю, для чего вышеуказанный код, возможно, нужен для дальнейших заданий.
    }


    public static int sumDigits(int number) {
        //@TODO: write code here
        String string = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += Character.getNumericValue(string.charAt(i));
        }
        System.out.println(sum);
        return sum;
    }
    public static void minMax(){
        int intMin = Integer.MIN_VALUE;
        System.out.println("Минимальное значение int: " + intMin);
        int intMax = Integer.MAX_VALUE;
        System.out.println("Максимальное значение int: " + intMax);
        double doubleMin = Double.MIN_VALUE;
        System.out.println("Минимальное значение double: " + doubleMin);
        double doubleMax = Double.MAX_VALUE;
        System.out.println("Максимальное значение double: " + doubleMax);
        float floatMin = Float.MIN_VALUE;
        System.out.println("Минимальное значение float: " + floatMin);
        float floatMax = Float.MAX_VALUE;
        System.out.println("Максимальное значение float: " + floatMax);
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("Минимальное значение byte: " + byteMin);
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Максимальное значение byte: " + byteMax);
        short shortMin = Short.MIN_VALUE;
        System.out.println("Минимальное значение short: " + shortMin);
        short shortMax = Short.MAX_VALUE;
        System.out.println("Максимальное значение short: " + shortMax);
        long longMin = Long.MIN_VALUE;
        System.out.println("Минимальное значение long: " + longMin);
        long longMax = Long.MAX_VALUE;
        System.out.println("Максимальное значение long: " + longMax);
    }
}
