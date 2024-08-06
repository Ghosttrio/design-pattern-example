package org.ghosttrio.decorator;

public abstract class Decorator implements FileOut {

    private FileOut delegate; // 위임 대상

    public Decorator(FileOut delegate) {
        this.delegate = delegate;
    }

    protected void doDelegate(byte[] data) {
        delegate.write(data); // 쓰기 위임
    }
}
