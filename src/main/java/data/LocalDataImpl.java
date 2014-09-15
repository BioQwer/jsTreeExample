package data;

import model.Node;

import java.util.HashMap;
import java.util.Map;
//Класс Синглтон
public class LocalDataImpl implements Data  {
    public static final int MAX_ELEMENT = 5000;

    private static LocalDataImpl ourInstance = new LocalDataImpl();

    public static LocalDataImpl getInstance() {
        return ourInstance;
    }

    private LocalDataImpl() {
    }

    @Override
    public Map getRoot() {         //Получем корень нашего дерева Это будет 10 элементов
        Map result = new HashMap();
        for (int i = 1; i < MAX_ELEMENT; i++) {
            Node node = new Node(Integer.toString(i),"#","Node "+i);       //To indicate a node should be a root node set its parent property to "#".
            result.put(node.getId(),node);
        }
        return result;
    }

    @Override
    public Map getById(String parentId) {     //Получем детей нашего дерева Это будет тоже 10 элементов, при этом Если Родитель нечетный то у него не будей
        Map result = new HashMap();
        if (Integer.parseInt(parentId)%2==0)
            for (int i = 1; i < MAX_ELEMENT; i++) {
                String newId = parentId+Integer.toString(i);
                Node node = new Node(newId, parentId,"Node "+newId);
                result.put(node.getId(),node);
            }
        return result;
    }
}
