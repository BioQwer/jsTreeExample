package data;

import model.Node;

import java.util.HashMap;
import java.util.Map;
<<<<<<< HEAD

/**
 * Manage tree.
 * Singleton.
 */
public class LocalDataImpl implements Data {
=======
//Класс Синглтон
public class LocalDataImpl implements Data  {
    public static final int MAX_ELEMENT = 5000;
>>>>>>> origin/master

    public static final int MAX_ELEMENT = 5000;

    private static volatile Data instance;

    public static Data getInstance() {
        if (instance == null) {
            synchronized (LocalDataImpl.class) {
                if (instance == null) {
                    instance = new LocalDataImpl();
                }
            }
        }
        return instance;
    }

    private LocalDataImpl() {
    }

    @Override
<<<<<<< HEAD
    public Map<String, Node> getRoot() {
        //Creates root of tree. It will be 10 elements.
        Map<String, Node> result = new HashMap<>();
=======
    public Map getRoot() {         //Получем корень нашего дерева Это будет 10 элементов
        Map result = new HashMap();
>>>>>>> origin/master
        for (int i = 1; i < MAX_ELEMENT; i++) {
            //To indicate a node should be a root node set its parent property to "#".
            Node node = new Node(Integer.toString(i), "#", "Node " + i);
            result.put(node.getId(), node);
        }
        return result;
    }

    @Override
<<<<<<< HEAD
    public Map<String, Node> getById(String parentId) {
        //Creates children of tree. It will be 10 elements too.
        //Odd parent doesn't have children, but even does.
        Map<String, Node> result = new HashMap<>();
        if (Integer.parseInt(parentId) % 2 == 0)
=======
    public Map getById(String parentId) {     //Получем детей нашего дерева Это будет тоже 10 элементов, при этом Если Родитель нечетный то у него не будей
        Map result = new HashMap();
        if (Integer.parseInt(parentId)%2==0)
>>>>>>> origin/master
            for (int i = 1; i < MAX_ELEMENT; i++) {
                String newId = parentId + Integer.toString(i);
                Node node = new Node(newId, parentId, "Node " + newId);
                result.put(node.getId(), node);
            }
        return result;
    }
}
