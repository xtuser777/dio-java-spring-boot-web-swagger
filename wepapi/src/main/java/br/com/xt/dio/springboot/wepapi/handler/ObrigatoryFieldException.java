package br.com.xt.dio.springboot.wepapi.handler;

public class ObrigatoryFieldException extends BusinessException {
    public ObrigatoryFieldException(String field) {
        super("O campo %s é obrigatório.", field);
    }
}
