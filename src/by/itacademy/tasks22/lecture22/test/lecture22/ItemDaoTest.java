package lecture22;

import java.sql.Connection;
import java.sql.SQLException;

import lecture22.db.ConnectionManager;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;

import lecture22.dao.ItemDao;
import lecture22.dao.impl.ItemDaoImpl;
import lecture22.entities.Item;
import org.junit.runners.MethodSorters;

/**
 * Class ItemDaoTest
 *
 * Created by yslabko on 08/02/2017.
 */
public class ItemDaoTest {
    private ItemDao itemDao = ItemDaoImpl.getInstance();

    public void initData() {}

    @Test
    public void fullTest() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        connection.setAutoCommit(false);
        int beforeSave = itemDao.getAll().size();
        Item newItem = itemDao.save(new Item("Makita", "HOF 12-23", 388.50));
        int afterSave = itemDao.getAll().size();
        Assert.assertNotSame(beforeSave, afterSave);

        connection.rollback();

        newItem.setModel("HF 12-23");
        itemDao.update(newItem);

        Item updatedItem = itemDao.get(newItem.getId());
        Assert.assertEquals("Метод update не корректен","HF 12-23", updatedItem.getModel());

        Item item2 = itemDao.getItemByModelAndSupplier("HF 12-23", "Makita");
        Assert.assertNotNull(item2);

        itemDao.delete(newItem.getId());

        afterSave = itemDao.getAll().size();
        Assert.assertEquals(beforeSave, afterSave);

    }


}
