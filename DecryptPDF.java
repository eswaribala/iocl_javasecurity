package com.iocl.utility;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class DecryptPDF {
	public static final String SRC = "src/main/resources/pdfs/security-spec_encrypted.pdf";
    public static final String DEST = "src/main/resources/pdfs/security-spec_decrypted.pdf";
 
    public static void main(String[] args) throws IOException, DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new DecryptPDF().manipulatePdf(SRC, DEST);
    }
 
    public void manipulatePdf(String src, String dest) throws IOException, DocumentException {
        PdfReader reader = new PdfReader(src, "data".getBytes());
        System.out.println(new String(reader.computeUserPassword()));
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest));
        stamper.close();
        reader.close();
    }
}
