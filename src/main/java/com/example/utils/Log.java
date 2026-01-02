package com.example.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {
    private static Logger log = LoggerFactory.getLogger(Log.class);
    //Aca vendria bien meterle algo para los estaus

    public void message(String mensaje ) {
        log.debug(mensaje);
    }

    public void message(String mensaje, Integer estatus) {
        log.debug(mensaje, estatus);
    }

    public void messageWarning(String mensaje, Integer estatus, Throwable throwable) {
        log.debug(mensaje, estatus, throwable);
    }

    public void messageError(String mensaje, Exception e, Integer estatus) {
        log.debug(mensaje, e, estatus);
    }
}
