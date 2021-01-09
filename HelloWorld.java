package helloworld;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class HelloWorld {
	
	public static final String DEST = "pdf/holamundo.pdf";
	
	public static void main(String arcs[]) throws IOException {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new HelloWorld().createPdf(DEST);
	}
	
	public void createPdf(String dest) throws IOException {
		FileOutputStream fos = new FileOutputStream(dest);
		PdfWriter writer = new PdfWriter(fos);
		PdfDocument pdf = new PdfDocument(writer);
		Document document = new Document(pdf);
		document.add(new Paragraph("Hola Mundo"));
		document.close();
	}
}
