package com.iocl.utility;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
public class EncryptPDF {

	public static final String SRC = "src/main/resources/pdfs/security-spec.pdf";
    public static final String DEST = "src/main/resources/pdfs/security-spec_encrypted.pdf";
 
    public static void main(String[] args) throws IOException, DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new EncryptPDF().manipulatePdf(SRC, DEST);
    }
 
    public void manipulatePdf(String src, String dest) throws IOException, DocumentException {
        PdfReader reader = new PdfReader(src);
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest));
        Date date=new Date();
        stamper.setEncryption("compute".getBytes(), "data".getBytes(),
            PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128 | PdfWriter.DO_NOT_ENCRYPT_METADATA);
        stamper.close();
        reader.close();
    }
}
