/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ltmj.util.constantes;

/**
 *
 * @author Usuario01
 */
public enum ErrorCode {
    NUMERO_NO_PERMITIDO("001"),
    BASE_DE_DATOS("002"),
    NULO("003");
   
    
    private final String value;
    
    ErrorCode(String value){
        this.value = value;
    }
    
    public String value(){
        return value;
    }  
}
