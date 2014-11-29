package ru.hwsec.teamara;

public class Instruction {

    // INIT_STATE
    public static final byte SET_PRIV_KEY   = (byte)0x00;
    public static final byte SET_KEY_EXPIRY = (byte)0x01;
    public static final byte SET_SIGNATURE  = (byte)0x02;
    public static final byte SET_PIN        = (byte)0x03;
    public static final byte SET_BALANCE    = (byte)0x04;


    //ISSUED_STATE
    // Mutual Authentication
    public static final byte TERMINAL_HELLO = (byte)0x10;
    public static final byte TERMINAL_TYPE  = (byte)0x11;
    public static final byte TERMINAL_KEY   = (byte)0x12;
    public static final byte GEN_SHARED_SECRET  = (byte)0x13;
    public static final byte TERMINAL_CHANGE_CIPHER_SPEC    = (byte)0x14;


    // Checks
    public static final byte CHECK_PIN      = (byte)0x20; // move under issued state.
    
    
    // Petrol Terminal
    public static final byte GET_BALANCE  = (byte)0x30;
    public static final byte UPDATE_BALANCE_PETROL = (byte)0x31;
    
    
    // Charging Terminal
    public static final byte GET_LOGS    = (byte)0x40;
    public static final byte UPDATE_BALANCE_CHARGE = (byte)0x41;

    private Instruction() { }
}
