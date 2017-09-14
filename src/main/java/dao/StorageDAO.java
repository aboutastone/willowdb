package dao;

import java.io.FileOutputStream;

public class StorageDAO {
    private String fileName;
    public StorageDAO(String fileName) {
        this.fileName = fileName;
    }
    public void writeBytes(byte[] myByteArray) throws Exception {
        FileOutputStream fos = new FileOutputStream(fileName);
        fos.write(myByteArray);
        fos.close();
    }
}
