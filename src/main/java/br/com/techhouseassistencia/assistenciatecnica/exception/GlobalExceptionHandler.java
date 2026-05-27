    package br.com.techhouseassistencia.assistenciatecnica.exception;

    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.ExceptionHandler;
    import org.springframework.web.bind.annotation.RestControllerAdvice;

    @RestControllerAdvice
    public class GlobalExceptionHandler {

        @ExceptionHandler(ClienteJaCadastradoException.class)
        public ResponseEntity clienteJaCadastrado(Exception e){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
