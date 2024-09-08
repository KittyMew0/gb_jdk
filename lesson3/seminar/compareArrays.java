package geekbrains_course.jdk.lesson3.seminar;

public class compareArrays {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {

        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {

    	//first check
        Integer[] intArray1 = {1, 2, 3};
        Integer[] intArray2 = {1, 2, 3};
        System.out.println(compareArrays(intArray1, intArray2)); 

        //second check
        String[] strArray1 = {"apple", "banana", "cherry"};
        String[] strArray2 = {"apple", "banana", "pear"};
        System.out.println(compareArrays(strArray1, strArray2)); 
    }
}
