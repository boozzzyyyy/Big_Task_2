import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        sukuKataO("Sampo");
        sukuKataO("Kapasitas");
        sukuKataO("Robot");
    }

    public static void sukuKataO(String input){
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0;i < input.length();i++){
            if(input.charAt(i) == 'a' || input.charAt(i) == 'i' || input.charAt(i) == 'u' || input.charAt(i) == 'e'){
                output.add(".");
            } else if(input.charAt(i) == 'o'){
                output.add("-");
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < output.size();i++){
            stringBuilder.append(output.get(i));
        }

        String joinedString = stringBuilder.toString();

        System.out.println("Input : " + input);
        System.out.println("Output : " + joinedString);
    }
}
