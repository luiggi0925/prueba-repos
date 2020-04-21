/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ltmj.util;

import pe.edu.ltmj.util.constantes.ErrorCode;

/**
 *
 * @author Usuario01
 */
public class ExceptionHandler extends Exception {
    
    private final ErrorCode errorCode;
    public ExceptionHandler(ErrorCode errorCode) {
        super();
        this.errorCode = errorCode;
    }
    public ExceptionHandler(String message, Throwable cause, ErrorCode errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }
    public ExceptionHandler(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    public ExceptionHandler(Throwable cause, ErrorCode errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }
    public ErrorCode getErrorCode() {
        return this.errorCode;
    }
    
}
