package Day14;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParsing extends DefaultHandler {
    public static void main(String[] args) {

        try {
            SAXParserFactory fac = SAXParserFactory.newInstance();
            SAXParser sx = fac.newSAXParser();
            sx.parse(new File("D://BackEndTraining//src//Student.xml"),new SaxParsing() );
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Document Started");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Document Ended");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start Element : "+qName);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("Ending Element : "+ qName);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Characters : "+ new String(ch,start,length));
    }

}
