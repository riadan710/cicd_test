package umc.umc7th_spring.apiPayload.exception.handler;

import umc.umc7th_spring.apiPayload.code.BaseErrorCode;
import umc.umc7th_spring.apiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
