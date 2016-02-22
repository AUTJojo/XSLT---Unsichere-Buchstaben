import javax.xml.transform.*;
import java.net.*;
import java.io.*;

public class Main {
public static void main(String[] args) {
  try {
	  
	System.out.println("Test");

    TransformerFactory tFactory = TransformerFactory.newInstance();

    Transformer transformer =
      tFactory.newTransformer
         (new javax.xml.transform.stream.StreamSource
            ("xslt.xsl"));

    transformer.transform
      (new javax.xml.transform.stream.StreamSource
            ("xml.xml"),
       new javax.xml.transform.stream.StreamResult
            ( new FileOutputStream("bsp2.html")));
    }
  catch (Exception e) {
    e.printStackTrace( );
    }
  }
}
