import java.util.Scanner; // Импортируем класс

public class InteractRunner { 
    
    public static void main(String[] arg) {
        Scanner reader = new Scanner(System.in); // Создаем обьект класса Skaner
        try {
            Calculator calc = new Calculator ();
            String exit = "n"; 
            String clean = "y";     // Объявили переменные
            double res = 0;
            
            while (!exit.equals("y")){
                if (clean.equals ("n")){
                    
                    calc.setFirst(res); // задать res
                    System.out.println("First arg : " + calc.getFirst()); // вывод первого аргумента
                    calc.cleanResult();
                } else {
                    calc.cleanResult ();
                       System.out.println ("Enter first arg : "); //Ввели первый аргумент
                       calc.setFirst (reader.nextDouble());
                    }
        
                System.out.println ("Ener second arg : "); // второй аргумент
                calc.setSecond(reader.nextDouble());
                
                System.out.println ("Enter operation for calc (+, -, *, /, ^) : "); // Ввели операцию
                calc.setOperation(reader.next().charAt(0)); // Считал 0 символ из массива
                
                res = calc.calculate(calc.getFirst(), calc.getSecond(), calc.getOperation()); // присвоили значение результата
                
                System.out.println ("Result : " + res); // Вывели результат
                
                System.out.println ("Exit :  y/n ");
                exit=reader.next();
                if (exit.equals("yes")) break;
                
                System.out.println ("Clean result : y/n");
                clean = reader.next();
            }
            
        }
        finally {
                reader.close();
            }
    }
}