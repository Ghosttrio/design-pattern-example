package org.ghosttrio.decorator;

public class EncryptionOut extends Decorator {

    public EncryptionOut(FileOut delegate) {
        super(delegate);
    }

    @Override
    public void write(byte[] data) {
        byte[] encryptedDate = data;
        super.doDelegate(encryptedDate);
    }
}
