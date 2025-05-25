import main.java.PasswordGenerator;


public class PasswordGeneratorUsage {
    public static void main(String[] args){
        int passwordLength = 12;
        String generatedPassword = PasswordGenerator.generatePassword(passwordLength);
        System.out.println("Згенерований пароль: " + generatedPassword);
    }
}
