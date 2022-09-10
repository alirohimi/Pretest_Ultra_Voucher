package Anagram;

import java.util.*;

public class findAnagram {

    //function untuk sort array menggunakan insertion sort
    private static Character sortArray(char[] array) {
        int number = array.length;
        int j = 0;
        for (int i = 0; i < number; i++) {
            Character keyValue = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > keyValue) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = keyValue;

        }
        return array[j];
    }
    //function anagram
    private static void printAnagrams(String words[])
    {
        HashMap<String, List<String> > map
                = new HashMap<>();

        // loopig untuk semua kata
        for (int i = 0; i < words.length; i++) {

            // konversi ke char array kemudian di sort dan
            // konnversi ulang ke string
            String word = words[i];
            char[] charWords = word.toCharArray();
            sortArray(charWords);
            String stringWord = new String(charWords);

            //kalkulasi hashcode string setelah sorting
            if (map.containsKey(stringWord)) {

                map.get(stringWord).add(word);
            }
            else {

                List<String> stringList = new ArrayList<>();
                stringList.add(word);
                map.put(stringWord, stringList);
            }
        }

        // print semua values yang anagram maupun tidak
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
                System.out.println(values);

        }
    }

    public static void main(String[] args)
    {

        // main code
        String arr[]
                = {"cook", "save", "taste", "aves", "vase", "state", "map"};
        printAnagrams(arr);
    }
}
