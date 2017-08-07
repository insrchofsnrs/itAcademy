package lecture22.services.impl;

import lecture22.dao.ItemDao;
import lecture22.dao.impl.ItemDaoImpl;
import lecture22.db.ConnectionManager;
import lecture22.entities.Item;
import lecture22.services.ItemService;
import lecture22.services.ServiceException;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by yslabko on 08/03/2017.
 */
public class ItemServiceImpl extends AbstractService implements ItemService {
    private ItemDao itemDao = ItemDaoImpl.getInstance();

    @Override
    public Item save(Item item) {
        try {
            //validation Item
            startTransaction();
            item = itemDao.save(item);
            commit();
        } catch (SQLException e) {
            throw new ServiceException("Error creating Item");
        }
        return item;
    }

    @Override
    public Item get(Serializable id) {
        return null;
    }

    @Override
    public void update(Item item) {

    }

    @Override
    public int delete(Serializable id) {
        return 0;
    }

    @Override
    public Item getItemByModelAndSupplier(String model, String supplier) {
        return null;
    }

    @Override
    public List<Item> getAll() {
        return null;
    }
}
