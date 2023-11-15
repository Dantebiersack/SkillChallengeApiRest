package com.ApiRest.SkillChallengeApiRest.GlobalExecptionHandler;

import com.ApiRest.SkillChallengeApiRest.Exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleProductoNotFoundException(ProductoNotFoundException ex){
        return new ErrorResponse("Producto no encontrado", ex.getMessage());
    }
    @ExceptionHandler(CarritoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleCarritoNotFoundException(CarritoNotFoundException ex){
        return new ErrorResponse("Carrito no encontrado", ex.getMessage());
    }

    @ExceptionHandler(CompradorNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleCompradorNotFoundException(CompradorNotFoundException ex){
        return new ErrorResponse("Comprador no encontrado", ex.getMessage());
    }

    @ExceptionHandler(OfertaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleOfertaNotFoundException(OfertaNotFoundException ex){
        return new ErrorResponse("Oferta no encontrado", ex.getMessage());
    }

    @ExceptionHandler(PerfilTiendaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handlePerfilTiendaNotFoundException(PerfilTiendaNotFoundException ex){
        return new ErrorResponse("Perfil de Tienda no encontrado", ex.getMessage());
    }

    @ExceptionHandler(ReseniaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleReseniaNotFoundException(ReseniaNotFoundException ex){
        return new ErrorResponse("Resenia no encontrado", ex.getMessage());
    }

    @ExceptionHandler(TransaccionNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleTransaccionNotFoundException(TransaccionNotFoundException ex){
        return new ErrorResponse("Transaccion no encontrado", ex.getMessage());
    }

    @ExceptionHandler(VendedorNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleVendedorNotFoundException(VendedorNotFoundException ex){
        return new ErrorResponse("Vendedor no encontrado", ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationErrorResponse handleValidationException(MethodArgumentNotValidException ex){
        List<String> errorMessages = ex.getBindingResult().getFieldErrors()
                .stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.toList());
        return new ValidationErrorResponse("Validación fallida", errorMessages);
    }
}
