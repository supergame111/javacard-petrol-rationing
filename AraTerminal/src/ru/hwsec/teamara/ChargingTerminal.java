package ru.hwsec.teamara;

import java.util.List;

import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;
import javax.smartcardio.CardTerminals;
import javax.smartcardio.CommandAPDU;
import javax.smartcardio.ResponseAPDU;
import javax.smartcardio.TerminalFactory;


public abstract class ChargingTerminal extends Terminal {


    // Methods

    public ChargingTerminal(){
        super();
    }

    /* Reference sec 7.6 of Design Document
     * Get card logs and ask card to clear logs
     */
    abstract boolean getLogs();



    /* Reference sec 7.6 of Design Document
     * Check if the card logs fulfil specified criteria
     *  - less than 200 litres per month
     *  - corresponds with backend
     *  - Only 5 withdrawals
     */
    abstract boolean checkLogs();


    /* Revoke the card if backend database has revoke flag set for that card*/
    abstract boolean revoke();

    /* If no error, update the card balance.
     * Store updated balance in database */
    abstract boolean updateBalance();

}