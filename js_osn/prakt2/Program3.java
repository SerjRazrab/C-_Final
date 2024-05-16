package prakt2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;

public class Program3 {
    //Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
    //Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
    //Обработайте ошибки с помощью try-catch конструкции. В случае возникновения  
    // исключения, оно должно записаться в лог-файл.
 
private static final Logger LOGGER = null;
public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("newText1.txt");
            String[] list = getArrayString("C:\\Users\\Разраб Сергей\\Desktop\\GIT\\js_osn\\prakt2");
            for (String s : list) {
                fileWriter.write(s + "\n");
            }
            fileWriter.close();
            FileHandler fileHandler = new FileHandler("log.txt");
            LOGGER.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            // Пример логгирования
            LOGGER.info("Пример записи в лог.");
            LOGGER.warning("Это предупреждение!");


            String fileName = "file.txt"; // Путь к файлу
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // Здесь можно проводить дополнительную обработку каждой строки,
                // например, анализ или обработка данных
            }
        }catch (Exception e){

        }
    }
        public static String[] getArrayString(String path) {
        File file = new File(path);
        return file.list();
    }
}
