package data;

import java.util.List;

/**
 * Interface provide access to tree data.
 *
 * @param <T>
 *         Node type
 */
public interface Data<T> {

    /**
     * Gets root.
     *
     * @return the root
     */
    public List<T> getRoot();

    /**
     * Gets by id.
     *
     * @param parentId
     *         the parent id
     * @return the by id
     */
    public List<T> getById(String parentId);

}
