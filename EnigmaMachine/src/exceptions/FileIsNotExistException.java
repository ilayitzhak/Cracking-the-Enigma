package exceptions;

public class FileIsNotExistException extends EnigmaLogicException {

    @Override
    public String getMessage() {

        return "The file is not valid because the file is not exist";
    }
}
