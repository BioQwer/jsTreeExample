package data;

import model.Node;

import java.util.Map;

/**
 * Created by Antony on 15.09.2014.
 */
public interface Data {

    public Map<String, Node> getRoot();

    public Map<String, Node> getById(String parentId);

}
