package umc.umc7th_spring.apiPayload.code;

public interface BaseErrorCode {
    ErrorReasonDTO getReason();

    ErrorReasonDTO getReasonHttpStatus();
}
