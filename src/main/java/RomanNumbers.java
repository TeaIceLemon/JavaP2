public class RomanNumbers {

    public int romanNumberTranslator(String string){
        int number=0;
        int current;
        int previous =0;
        for(int i =0; i<string.length();i++){
            current = signToNumber(string.toLowerCase().charAt(i));
            if(current > previous){
                number += current - (2*previous);
            }
            else number += current;
            previous = current;
        }
    return number;
    }

    private int signToNumber(char x){

        if(x == 'i') return 1;
        else if(x == 'v') return 5;
        else if(x == 'x') return 10;
        else if(x == 'l') return 50;
        else if(x == 'c') return 100;
        else if(x == 'd') return 500;
        else if(x == 'm') return 1000;
        else return 0;
    }
}
