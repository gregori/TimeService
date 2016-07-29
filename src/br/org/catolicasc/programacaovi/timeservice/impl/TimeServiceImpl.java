package br.org.catolicasc.programacaovi.timeservice.impl;

import java.util.Date;

import javax.jws.WebService;

import br.org.catolicasc.programacaovi.timeservice.TimeService;

/**
 *  The @WebService property endpointInterface links the
 *  SIB (this class) to the SEI (eser1.ts.TimeServer).
 *  Note that the method implementations are not annotated
 *  as @WebMethods.
*/
@WebService(endpointInterface = "br.org.catolicasc.programacaovi.timeservice.TimeService")
public class TimeServiceImpl implements TimeService {

    public String getTimeAsString() { return new Date().toString(); }
    public long getTimeAsElapsed() { return new Date().getTime(); }
}
