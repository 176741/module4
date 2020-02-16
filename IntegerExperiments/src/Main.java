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
}
