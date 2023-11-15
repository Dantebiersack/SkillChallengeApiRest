package com.ApiRest.SkillChallengeApiRest.Exception;

public class VendedorNotFoundException extends RuntimeException{
    public VendedorNotFoundException(String messaje){
        super(messaje);
    }
}
