package data;

import junit.framework.TestCase;
import utils.ConverterJSON;

public class LocalDataImplTest extends TestCase {

    Data data = LocalDataImpl.getInstance();

    public void testGetInstanse() throws Exception {
        assertEquals(LocalDataImpl.getInstance(),data);
    }

    public void testGetRoot() throws Exception {
        //Просмотренно
        String dataText = "[{\"id\":\"3\",\"parent\":\"#\",\"text\":\"Node 3\",\"children\":true},{\"id\":\"2\",\"parent\":\"#\",\"text\":\"Node 2\",\"children\":true},{\"id\":\"1\",\"parent\":\"#\",\"text\":\"Node 1\",\"children\":true},{\"id\":\"7\",\"parent\":\"#\",\"text\":\"Node 7\",\"children\":true},{\"id\":\"6\",\"parent\":\"#\",\"text\":\"Node 6\",\"children\":true},{\"id\":\"5\",\"parent\":\"#\",\"text\":\"Node 5\",\"children\":true},{\"id\":\"4\",\"parent\":\"#\",\"text\":\"Node 4\",\"children\":true},{\"id\":\"9\",\"parent\":\"#\",\"text\":\"Node 9\",\"children\":true},{\"id\":\"8\",\"parent\":\"#\",\"text\":\"Node 8\",\"children\":true}]";
        assertEquals(dataText,ConverterJSON.toJSON_String(data.getRoot()));
    }

    public void testGetById() throws Exception {
        assertEquals("[]",ConverterJSON.toJSON_String(data.getById("1")));
        //Просмотренно
        String dataText = "[{\"id\":\"21\",\"parent\":\"2\",\"text\":\"Node 21\",\"children\":true},{\"id\":\"22\",\"parent\":\"2\",\"text\":\"Node 22\",\"children\":true},{\"id\":\"23\",\"parent\":\"2\",\"text\":\"Node 23\",\"children\":true},{\"id\":\"24\",\"parent\":\"2\",\"text\":\"Node 24\",\"children\":true},{\"id\":\"25\",\"parent\":\"2\",\"text\":\"Node 25\",\"children\":true},{\"id\":\"26\",\"parent\":\"2\",\"text\":\"Node 26\",\"children\":true},{\"id\":\"27\",\"parent\":\"2\",\"text\":\"Node 27\",\"children\":true},{\"id\":\"28\",\"parent\":\"2\",\"text\":\"Node 28\",\"children\":true},{\"id\":\"29\",\"parent\":\"2\",\"text\":\"Node 29\",\"children\":true}]";
        assertEquals(dataText,ConverterJSON.toJSON_String(data.getById("2")));

    }
}