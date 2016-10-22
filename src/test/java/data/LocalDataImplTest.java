package data;

import java.util.List;

import junit.framework.TestCase;
import model.Node;
import utils.ConverterJSON;

public class LocalDataImplTest extends TestCase {

    private static int _size = LocalDataImpl.MAX_ELEMENT;
    private LocalDataImpl data = LocalDataImpl.getInstance();

    public void testGetInstanse() throws Exception {
        assertEquals(LocalDataImpl.getInstance(), data);
    }

    public void testGetRoot() throws Exception {
        assertEquals(_size, data.getRoot().size());
    }

    public void testGetById() throws Exception {
        assertEquals("[]", ConverterJSON.toJsonToString(data.getById("1")));

        List<Node> dataById = data.getById("2");
        assertEquals(_size, dataById.size());
        for (Node node :dataById) {
            assertTrue(node.getChildren());
        }
    }
}