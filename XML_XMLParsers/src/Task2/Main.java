package Task2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        Units units = new Units();
        units.add(new City("Kyiv" , "Bazhana Ave", 14));
        units.add(new City("Kanata", "Loggerhead Heights", 66));

        try{
            File file = new File("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\XML_XMLParsers\\src\\Task2\\output.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Units.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(units, file);
            marshaller.marshal(units, System.out);


            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            units = (Units) unmarshaller.unmarshal(file);
            System.out.println(units);

        }catch(JAXBException e){
            e.printStackTrace();
        }
    }
}
