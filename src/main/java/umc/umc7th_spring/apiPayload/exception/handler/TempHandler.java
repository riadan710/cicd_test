package umc.umc7th_spring.apiPayload.exception.handler;

import umc.umc7th_spring.apiPayload.code.BaseErrorCode;
import umc.umc7th_spring.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
