package io.github.fantasmadux.websocketmicro.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class ServerAnswerException extends HttpStatusCodeException {
    public ServerAnswerException() {
        super(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
