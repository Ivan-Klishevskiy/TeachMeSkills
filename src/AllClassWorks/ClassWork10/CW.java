package AllClassWorks.ClassWork10;

public class CW {
    public static boolean signIn(String login,String password, String confirmPassword){
        try {

            if(login.length()<20&&password.length()<20){
                if (checkField(login)) {
                    throw new WrongLoginException();
                }
                if (checkField(password)) {
                    throw new WrongPasswordException();
                }
                if(!password.equals(confirmPassword)){
                    throw new WrongPasswordException();
                }
            }else if(password.length()<20){
                throw new WrongPasswordException();
            }else{
                throw new WrongLoginException();
            }
            return true;
        }
        catch (WrongLoginException wrongLoginException){
            System.out.println("Wrong Login Exception");
        }
        catch (WrongPasswordException wrongPasswordException){
            System.out.println("Wrong Password Exception");
        }
        return false;
    }

    private static boolean checkField(String login) throws RuntimeException{
        char[]aChar= login.toCharArray();
        boolean containsNumbers=false;
        boolean containsUnderScope=false;
        boolean containsLetters=false;
        for (char c : aChar) {
            if(c>='0'&&c<='9'){
                containsNumbers=true;
                continue;
            }
            if(c=='_'){
                containsUnderScope=true;
                continue;
            }
            if(c>='A'&&c<='Z'||c>='a'&&c<='z'){
                containsLetters=true;
            }
        }
        return !containsLetters||!containsNumbers||!containsUnderScope;
    }
}
