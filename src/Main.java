public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String binSum = bins.sum("11111011", "111");
        System.out.println("Сумма чисел в двоичной системе исчисления " + binSum);
        String binMult = bins.mult("110", "1011");
        System.out.println("Произведение чисел в двоичной системе исчисления " + binMult);

    }
}
