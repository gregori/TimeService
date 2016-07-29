package br.org.catolicasc.programacaovi.timeservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.*;

/**
 *  The annotation @WebService signals that this is the
 *  SEI (Service Endpoint Interface). @WebMethod signals 
 *  that each method is a service operation.
 *
 *  The @SOAPBinding annotation impacts the under-the-hood
 *  construction of the service contract, the WSDL
 *  (Web Services Definition Language) document. Style.RPC
 *  simplifies the contract and makes deployment easier.
*/
@WebService
//@SOAPBinding(style = Style.RPC , use=Use.ENCODED) 
@SOAPBinding(style = Style.RPC )
public interface TimeService {
    @WebMethod String getTimeAsString();
    @WebMethod long getTimeAsElapsed();
}
