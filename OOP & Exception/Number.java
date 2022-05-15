// Create class Number with only one private instance variable as a double primitive type. To include the following methods
// (include respective constructors) isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ),isPrime(), isAmstrong()
// the above methods return boolean primitive type.
// getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above methods return double primitive type.
// void listFactor(), void dispBinary().
package itssachin.assignments2;

public class Number {
        private final double d;

        public Number(double d){
            this.d = d;
        }

        public boolean isZero(){
            return d == 0.0;
        }

        public boolean isPositive(){
            return d > 0.0;
        }

        public boolean isNegative(){
            return d < 0.0;
        }

        public boolean isOdd(){
            return d % 2 != 0.0;
        }

        public boolean isEven(){
            return d % 2 == 0.0;
        }

        public boolean isPrime(){
            boolean result = false;
            if(d==2)
                result=true;
            else{
                for (int i=2; i<d; i++){
                    if (d%i==0){
                        result = false;
                        break;
                    }
                    else
                        result = true;
                }
            }
            return result;
        }

        public boolean isArmstrong(){
            int num= (int)d, n=0;
            while (num != 0) {
                num /= 10;
                n++;
            }
            num = (int)d;
            int result = 0;
            while (num != 0) {
                // calculate the last digit
                int remainder = num % 10;
                // calculate the power of digit using pow function i.e included in math.h
                result += Math.pow(remainder, n);
                // remove the last digit
                num /= 10;
            }
            return result == num;
        }

        public double getFactorial(int n){
            if (n == 0)
                return 1;
            else
                return(n * getFactorial(n-1));
        }

        public double getSqrt(){
            double sqrt;
            sqrt = Math.sqrt(d);
            return sqrt;
        }

        public double getSqr() {
            return d*d;
        }

        public double sumDigits(){
            double sum = 0, num=d;
            double digit;
            while (num!=0){
                digit = num % 10;
                sum += digit;
                num =  num/ 10;
            }
            return sum;
        }

        public double getReverse(){
            int n=(int)d;
            int digit, temp = 0;
            while (n!=0) {
                digit = n%10;
                temp = temp * 10 + digit;
                n = n/10;
            }
//            temp = digit * 10 +n;
            return temp;
        }

        void listFactor(){
            int num= (int)d;
            System.out.print("Factors of (int)d are: ");
            for (int i = 1; i <= num; i++) {
                if(num % i== 0)
                    System.out.print(i+" ");
            }
            System.out.println();
        }

        public void dispBinary(){
            System.out.println("Binary of "+d+":      " + Long.toBinaryString((long) d));
        }

        public static void main (String[] args){
            Number number = new Number(107.56);
            System.out.println("The given numbers is: 107.56");

            System.out.println ("isZero       " + number.isZero() );
            System.out.println ("isPositive   " + number. isPositive());
            System.out.println ("isNegative   " + number.isNegative() );
            System.out.println ("isOdd        " + number.isOdd());
            System.out.println ("isEven       " + number.isEven());
            System.out.println ("isPrime      " +number.isPrime());
            System.out.println ("isArmstrong((int)d)  " +number.isArmstrong());
            System.out.println();
            System.out.println ("getFactorial((int)d)   " + number.getFactorial((int)number.d));
            System.out.printf ("getSqrt()              %.2f\n", number. getSqrt());
            System.out.printf ("getSqr()               %.2f\n", number.getSqr());
            System.out.printf ("sumDigits((int)d)      %.2f\n", number.sumDigits());
            System.out.println ("getReverse((int)d)     " + number.getReverse());

            number.listFactor();
            number.dispBinary();
//            System.out.println (" isPrime " +number.isPrime());
        }
}
