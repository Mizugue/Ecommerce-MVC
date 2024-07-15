package com.ecommerce.ecom.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class APIException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public APIException(String messsage){
        super(messsage);
    }


}
