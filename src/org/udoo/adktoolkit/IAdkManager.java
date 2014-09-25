package org.udoo.adktoolkit;

/**
 * Defines ADK interfaces
 */

public interface IAdkManager {
    String readSerial();
    void writeSerial(String text);
    byte[] readByteArray();
    void writeByteArray(byte[] buffer);

    // Activity related interfaces
    void close();
    void open();
	
	
}
