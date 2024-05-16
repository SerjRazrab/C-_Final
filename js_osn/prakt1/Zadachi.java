    //Дан массив двоичных чисел, например [1,1,0,1,1,1], 
    //вывести максимальное количество подряд идущих 1.
    // public class Main {
    //     public static void main(String[] args) {
    //         int[] arr = {1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1};
    //         getCount(arr);
    
    //     }
        
    //     public static void getCount(int[] array) {
    //         int count = 0;
    //         int max = 0;
    //         for (int i = 0; i < array.length; i++) {
    //             if (array[i] == 1) {
    //                 count++;
    //                 if (max < count) max = count;
    //             } else {
    //                 count = 0;
    //             }
    //         }
    //         System.out.println(max);
    //     }
    // }

    //Дан массив nums = [3,2,2,3] и число val = 3. 
//Если в массиве есть числа, равные заданному, 
//нужно перенести эти элементы в конец массива. 
//Таким образом, первые несколько (или все) элементов массива 
//должны быть отличны от заданного, а остальные - равны ему.


import java.util.Arrays;
public static void main(String[] args) {
public class MoveValToEnd {

    public static void moveValToEnd(int[] nums, int val) {
        int begin = 0;
        int end = nums.length - 1;

        while (begin < end) {
            if (nums[begin] == val) {
                swap(nums, begin, end);
                end--;
            } else {
                begin++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        moveValToEnd(nums, val);
        System.out.println(Arrays.toString(nums));
    }
}
}

public class ReverseWordsInString {
    public static void main(String[] args) {
        String input = "Добро пожаловать на курс по Java";
        String[] words = input.split("\\s+");
        
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        
        String output = reversed.toString().trim();
        System.out.println(output);
    }
}