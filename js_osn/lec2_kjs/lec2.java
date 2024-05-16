package lec2_kjs;
// public class program1 {

//     //Работа со стороками. пример :
// //Сохдать строку из 1млн плюсиков.Как?

//     public static void main(String[] args) {
// StringBuilder sb = new StringBuilder();
// for(int i = 0; i < 1_000;i++){
//     sb.append("+" + " " + "s ");
// }
// System.out.println(sb);

// String [] name = {"С", "Е", "Р", "Г", "Е", "Й"};
// String sk = "Сергей Ка";
// System.out.println(sk.toLowerCase());
// System.out.println(String.join("",name));
// System.out.println(String.join("","С", "Е", "Р", "Г", "Е", "Й"));
// System.out.println(String.join(",","С", "Е", "Р", "Г", "Е", "Й"));

//     }
// }

//Работа с файлами
import java.io.File;
import java.util.logging.FileHandler;
import java.util.logging.*;
import java.io.IOException;



// public class lec1 {
//     public static void main(String[] args) {
//         try {// код в котором можем появиться ошибка
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File file = new File(pathFile);
//             if (file.createNewFile()) {// проверка создался ли файл
//                 System.out.println("file.created");
//             } else {
//                 System.out.println("file.existed");
//             }
//             System.out.println("try");// f3.getAbsolutePath());
//         } catch (Exception e) {// Обработка, если ошибка случилась
//             System.out.println("catch");
//         } finally {// Код , который выполнился в любом случае
//             System.out.println("finally");
//         }
//     }
    public class lec2{
    public static void main(String[] args) throws IOException{
            Logger logger = Logger.getLogger(lec2.class.getName());
            //FileHandler fh = new FileHandler("file.txt");//вывод лога в файл
            ConsoleHandler ch = new ConsoleHandler(); //вывод лога в консоль
            
            logger.addHandler(ch);
            //logger.addHandler(fh);

            //SimpleFormatter sFormat = new SimpleFormatter();
            XMLFormatter xml = new XMLFormatter();
            //info.setFormatter(sFormat);
            ch.setFormatter(xml);
            //fh.setFormatter(xml); // зависимость FileHandler

            logger.log(Level.WARNING, "Тестовое логгирование 1");
            //logger.info("Тестовое логгирование 2");
        }
    }



// работа с файловой системой.Файлы.Ошибки
// try{
// //код в котором можем появиться ошибка
// }
// catch(Exception e){
// //Обработка, если ошибка случилась
// }finally{
// //Код , который выполнился в любом случае
// }
