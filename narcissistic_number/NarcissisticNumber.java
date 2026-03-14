public class NarcissisticNumber {
    public static void main(String[] args) {
        /*水仙花数（Narcissistic number）又称超完全数字不变数（PPDI）、
        自恋数、自幂数、阿姆斯特朗数（Armstrong number），特指每个数位
        上的数字的3次幂之和等于其本身的三位数。*/
        int unitsDigit = 0, tensDigit = 0, hundredsDigit = 0, count = 0;
        for (int i = 100; i <= 999; i++) {
            unitsDigit = i / 1 % 10;
            tensDigit = i / 10 % 10;
            hundredsDigit = i / 100 % 10;
            if (unitsDigit * unitsDigit * unitsDigit +
                    tensDigit * tensDigit * tensDigit + hundredsDigit * hundredsDigit * hundredsDigit == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花数的个数为：" + count);
    }
}
