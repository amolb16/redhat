package converter;

public class Conversion {

    private char flipValues(char c){
        return  c == '1' ? '0' : '1';
    }

    private String twosComplement(String base2NumString){
        StringBuilder base2Num;
        base2Num = new StringBuilder(base2NumString);
        boolean isFirst1OccurrencePassed = false;
        for(int i = base2Num.length()-1 ; i>=0; i--){
            if(isFirst1OccurrencePassed){
                base2Num.setCharAt(i, flipValues(base2Num.charAt(i)));
            }else if(base2Num.charAt(i) == '1'){
                isFirst1OccurrencePassed = true;
            }

        }
        return base2Num.toString();
    }

    private String convertToBinary(int base10){
        int quotient = base10;
        int remainder;
        StringBuilder base2Num = new StringBuilder();
        do{
            remainder = quotient % 2;
            quotient = quotient / 2;
            base2Num.append(remainder);
        } while(quotient != 0);
        base2Num.reverse();
        String base2NumString = String.format("%8s", base2Num.toString()).replace(' ', '0');
        return base2NumString;
    }

    public String base10to2(String base10){
        int base10Num = Integer.parseInt(base10);
        if(base10Num < -127 || base10Num > 127){
            return "Given number is not in between -127 and 127";
        }else{
            String base2NumString = convertToBinary(Math.abs(base10Num));
            if(base10Num >= 0){
                return base2NumString;
            }else{
                return twosComplement(base2NumString);
            }
        }
    }

    public String negBase2(String base10){
        int base10Num = Integer.parseInt(base10);
        if(base10Num < -127 || base10Num > 127){
            return "Given number is not in between -127 and 127";
        }else{
            String base2Complement = base10to2(base10);
            String negBase2Complement = twosComplement(base2Complement);
            return negBase2Complement;
        }
    }

    public static void main(String args[]){
        String base10Num = args[0];
        System.out.println("Base 10 number: " + base10Num);
        Conversion conversion = new Conversion();
        System.out.println("8-bit 2's compliment: " + conversion.base10to2(base10Num));
        System.out.println("8-bit 2's compliment negative: " + conversion.negBase2(base10Num));
    }
}
