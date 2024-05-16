class Prof {

public static void main(String[] args)
    throws java.io.IOException {
        char ch,ignore, answer = '.';
        System.out.println("Попробуйте подобрать символ от кодового замка !");
        System.out.println("Введите код :");
        ch = (char) System.in.read();
        int i=0;
        int j = 10;
        do  {
            ignore = (char) System.in.read();
        }
        while(ignore != '\n');
        for( ; ; ){
            if (ch== answer) System.out.println("Вы ввели правильный символ" + ch);
            for (j = 10;j < ch;j--){
            if(ch!=answer)
            System.out.println("Введен неправильный символ ");
            System.out.print("Осталось попыток " + j);
            
            if (ch==answer)
            System.out.println("Вы ввели правильный символ" + ch);
            //ch = (char) System.in.read();

            }
        }
        
    
    }

}

    
