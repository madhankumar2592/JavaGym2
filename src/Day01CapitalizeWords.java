import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day01CapitalizeWords {

    public static String capitalizeWords(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        return sb.toString().trim();
    }

    public static String Captilize(String input){

        if(input == null || input.isEmpty()){
            return input;
        }

        String[] test ={"Atest"};

        String[] inputList = input.split(" ");

        StringBuilder sb = new StringBuilder();

        /*for (String value : inputList){
            sb.append(Character.toUpperCase(value.charAt(0)))
                    .append(value.substring(1))
                    .append("");
        }*/

       /* List<String> results = Arrays.stream(inputs)
                .map(s -> wand.matcher(s).replaceAll(m -> m.group().toUpperCase()))
                .collect(Collectors.toList());*/

        Pattern wand = Pattern.compile("\\b\\w");
        String result = wand.matcher("hellow, java worlds")
                .replaceAll(match -> match.group().toUpperCase());

       // List<String> result = Arrays.stream(input)


        return result;
    }


    public static List<String> testCapitalize(String[] input){

        Pattern wand = Pattern.compile("\\b\\w");
        Pattern wand1 = Pattern.compile("\\b\\w");

        Arrays.stream(input).map(i -> wand.matcher(i).replaceAll(in -> in.group().toUpperCase()));

        return Arrays.stream(input).map(i -> wand.matcher(i).replaceAll(matchResult -> matchResult.group().toUpperCase())).collect(Collectors.toList());

    }

    public static void main(String[] args) {

        String[] input = {"hello","java","worldava"};
        List<String> tets =List.of("OMS" ,"MK");
        Integer[] in = {1,2,3};

        List<String> result = testCapitalize(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);

    }
}