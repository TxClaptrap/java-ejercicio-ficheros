package XML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MainExportar {
    public static void main(String[] args) {
        try {
            PersonaXML persona = new PersonaXML("Juan", 30);
            JAXBContext context = JAXBContext.newInstance(PersonaXML.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(persona, new File("clientes.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
