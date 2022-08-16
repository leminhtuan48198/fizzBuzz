public class FizzBuzz {
    public static String fizzBuzzTranslate(int number){
        if(number%15==0||number==35||number==53){
            return "FizzBuzz";
        } else if (number%3==0||number/10==3||number%10==3) {
            return"Fizz";
        } else if (number%5==0||number/10==5||number%10==5) {
            return "Buzz";
        }else if(number<10){
            return read(number%10);
        }else if(number<20){
            return read19(number);
        }
            return read(number/10)+" "+read(number%10);
    }
    public static String read(int number){
        switch (number){
            case 1:
                return "mot";
                case 2:
                return "hai";
                case 3:
                return "ba";
                case 4:
                return "bon";
            case 5:
                return "nam";
            case 6:
                return "sau";
                case 7:
                return "bay";
                case 8:
                return "tam";
                case 9:
                return "chin";
            default:
                return "muoi";
        }
    }
    public static String read19(int number){
        switch (number) {

            case 11:
                return "muoi mot";
            case 12:
                return "muoi hai";

            case 14:
                return "muoi bon";

            case 16:
                return "muoi sau";
            case 17:
                return "muoi bay";

            case 19:
                return "muoi chin";
            default:
                return "";
        }

    }
}
