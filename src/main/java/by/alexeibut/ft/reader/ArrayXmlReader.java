package by.alexeibut.ft.reader;

import by.alexeibut.ft.exception.ArrayException;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ArrayXmlReader {

    public List<List<String>> read(String path) throws ArrayException {
        try {
            DocumentBuilder builder =
                    DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = builder.parse(new File(path));
            document.getDocumentElement().normalize();

            NodeList arrays = document.getElementsByTagName("array");
            List<List<String>> result = new ArrayList<>();

            for (int i = 0; i < arrays.getLength(); i++) {
                NodeList values = arrays.item(i).getChildNodes();
                List<String> list = new ArrayList<>();

                for (int j = 0; j < values.getLength(); j++) {
                    Node node = values.item(j);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        list.add(node.getTextContent().trim());
                    }
                }
                result.add(list);
            }
            return result;
        } catch (Exception e) {
            throw new ArrayException("XML read error", e);
        }
    }
}