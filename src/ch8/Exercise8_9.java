package ch8;

public class Exercise8_9 {
    public static void main(String[] args) {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE;

    UnsupportedFunctionException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
}