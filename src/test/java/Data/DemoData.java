package Data;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by rakeshprabhakaran on 9/01/2016.
 */
public class DemoData {
    public static void main(String[]args){

        JAXBContext jc= null;
        try {
            jc = JAXBContext.newInstance(Tests.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            File xml =new File("src/test/java/Data/testdata01.xml");
            Tests tests= (Tests) unmarshaller.unmarshal(xml);
            System.out.println(tests.getTestData().getPassword());


        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
