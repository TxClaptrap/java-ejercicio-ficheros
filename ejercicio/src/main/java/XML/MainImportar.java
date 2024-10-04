package XML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class MainImportar {
    public static void main(String[] args) {
   

            String xml = (new File("clientes.xml")).toString();
            
            System.out.println(xml);
           
            /*JAXBContext context = JAXBContext.newInstance(Persona.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            PersonaXML persona = (PersonaXML) unmarshaller.unmarshal(new
            StringReader(xml));
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
           } catch (JAXBException e) {
            e.printStackTrace();*/
           
    }
}
