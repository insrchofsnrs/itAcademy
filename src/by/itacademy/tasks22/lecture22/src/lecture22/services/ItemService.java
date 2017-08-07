package lecture22.services;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import lecture22.entities.Item;

/**
 * Class ItemService
 *
 * Created by yslabko on 07/02/2017.
 */
public interface ItemService {

    Item save(Item item);

    Item get(Serializable id);

    void update(Item item);

    int delete(Serializable id);

    Item getItemByModelAndSupplier(String model, String supplier);

    List<Item> getAll();
}
