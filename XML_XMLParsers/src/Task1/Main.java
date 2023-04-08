package Task1;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws XMLStreamException {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();


            File file = new File("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\XML_XMLParsers\\src\\Task1\\output.xml");

            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileOutputStream(file));

            writer.writeStartDocument("1.0");
            writer.writeStartElement("city");
            writer.writeAttribute("BigCity", String.valueOf(4));
            writer.writeCharacters("Kyiv");
            writer.writeEndElement();
            writer.writeStartElement("street");
            writer.writeCharacters("Bazhana ave");
            writer.writeEndElement();
            writer.writeStartElement("block");
            writer.writeCharacters("14");
            writer.writeEndElement();

            writer.writeStartElement("city");
            writer.writeAttribute("BigCity", String.valueOf(2));
            writer.writeCharacters("London");
            writer.writeEndElement();
            writer.writeStartElement("street");
            writer.writeCharacters("Hornsey Rd");
            writer.writeEndElement();
            writer.writeStartElement("block");
            writer.writeCharacters("null");
            writer.writeEndElement();
            writer.writeEndDocument();

            writer.flush();
            writer.close();







        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
