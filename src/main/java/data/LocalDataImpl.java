package data;

import java.util.ArrayList;
import java.util.List;

import model.Node;

public class LocalDataImpl implements Data<Node> {

    public static final int MAX_ELEMENT = 100;

    private static LocalDataImpl ourInstance = new LocalDataImpl();

    public static LocalDataImpl getInstance() {
        return ourInstance;
    }

    private LocalDataImpl() {
    }

    @Override
    public List<Node> getRoot() {
        List<Node> nodes = new ArrayList<>(MAX_ELEMENT);
        for (int i = 0; i < MAX_ELEMENT; i++) {
            Node node = new Node(Integer.toString(i),"#","Node "+i);       //To indicate a node should be a root node set its parent property to "#".
            nodes.add(node);
        }
        return nodes;
    }

    @Override
    public List<Node> getById(String parentId) {     //Получем детей нашего дерева Это будет тоже 10 элементов, при этом Если Родитель нечетный то у него не будей
        List<Node> nodes = new ArrayList<>(MAX_ELEMENT);
        if (Integer.parseInt(parentId)%2==0)
            for (int i = 0; i < MAX_ELEMENT; i++) {
                String newId = parentId+Integer.toString(i);
                Node node = new Node(newId, parentId,"Node "+newId);
                nodes.add(node);
            }
        return nodes;
    }
}
