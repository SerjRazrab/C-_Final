package prakt2;


    //Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

        import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.List;
        import java.util.logging.FileHandler;
        import java.util.logging.Logger;
        import java.util.logging.SimpleFormatter;
        
        public class Program2 {
            public static void main(String[] args) throws IOException {
                String fileName = "file.txt";
                FileWriter fileWriter = new FileWriter("newText.txt");
                fileWriter.write(testReturn());
                fileWriter.close();
            }
        
            public static String testReturn(){
                StringBuilder stringBuilder = new StringBuilder("Test");
                for (int i = 1; i < 100; i++) {
                    stringBuilder.append("Test" + " ");
                }
                return stringBuilder.toString();
            }
        }

