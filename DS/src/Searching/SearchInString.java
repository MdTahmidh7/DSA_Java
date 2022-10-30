package Searching;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Tahmid";
        char target = 'p';
        boolean result = false;
        int length = name.length();
        for (int i = 0; i < length; i++) {
            if (target==name.charAt(i)){
                result =true;
                break;
            }
        }
        if (result){
            System.out.println("Character found");
        }else {
            System.out.println("Character not found");
        }
    }
}
