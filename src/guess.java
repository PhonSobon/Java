import java.util.Scanner;
public class guess {
    public static void main(String[] args) {
        char [] name = new char[20];
        System.out.print("Insert your name: ");
        String Name = new Scanner(System.in).nextLine();
        String name1 = Name.toUpperCase();
        int sum = 0,sum1=0,sum2=0;
        for(int i=0;i<name1.length();i++){
            switch ((name1.charAt(i))){
                case 'A','J','s':
                    sum+=1;
                    break;
                case 'B','K','T':
                    sum+=2;
                    break;
                case 'C','L','U':
                    sum+=3;
                    break;
                case 'D','M','V':
                    sum+=4;
                    break;
                case 'E','N','W':
                    sum+=5;
                    break;
                case 'F','O','X':
                    sum+=6;
                    break;
                case 'G','P','Y':
                    sum+=7;
                    break;
                case 'H','Q','Z':
                    sum+=8;
                    break;
                case 'I','R':
                    sum+=9;
                    break;
                case ' ':
                    sum+=0;
                    break;
                default:
                    sum+=0;
                    break;
            }
        }
        int result;
        while (true){
            result = sum/10;
            sum = sum%10;
            sum1 = sum + result;
            if(sum1>9){
                result = sum1/10;
                sum1 = sum1%10;
                sum2 = result + sum1;
                System.out.println("You are in number: " + sum2);
            }else {
                System.out.println("You are in number: " + sum1);
            }
            break;
        }
    }
    }
