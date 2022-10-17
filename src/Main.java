import java.util.*;


public class Main {
    public static List<Integer> findOdds(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                result.add(num);
            }
        } return result;
    }

    public static Set<Integer> findEven (List<Integer> nums) {
        Collections.sort (nums);
        Set<Integer> result = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

    public static Set<String> findUniqueWords (List<String> words) {
        Set<String> result = new HashSet<>();
        for (String word : words) {
            result.add(word.toLowerCase());
        }
        return result;
    }

    public static void findNumberOfRepeat(List<String> words) {
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String tempWord = words.get(i).toLowerCase();
            if (!result.containsKey(tempWord)) {
                result.put(tempWord, 1);
            } else {
                result.put(tempWord, result.get(tempWord) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue() != 1) {
                System.out.println("слово = " + entry.getKey() + ", повторений = " + entry.getValue());
            }
        }
    }




    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 12, 3, 8, 4, 4, 5, 5, 6, 7));
        //Задание 1  только нечетные числа
        System.out.println(findOdds (nums));
        //Задание 2 только четные числа без повторений в порядке возрастания
        System.out.println(findEven(nums));
        //Задание 3. все уникальные слова из списка слов, в котором могут встречаться дубли
        List<String> words = new ArrayList<>(List.of("один", "два", "два", "три", "Три", "три"));
        System.out.println(findUniqueWords(words));
        //Задание 4. все количество дублей из списка слов
        findNumberOfRepeat(words);

    }
}


