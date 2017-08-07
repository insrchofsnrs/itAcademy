package by.progect.test;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Evgeni on 07.08.17.
 */
public class DaoTest {
    private lecture22.dao.ItemDao itemDao = lecture22.dao.impl.ItemDaoImpl.getInstance();

    public void initData() {}

    @Test
    public void fullTest() throws SQLException {
        Connection connection = lecture22.db.ConnectionManager.getConnection();
        connection.setAutoCommit(false);
        int beforeSave = itemDao.getAll().size();
        lecture22.entities.Item newItem = itemDao.save(new lecture22.entities.Item("Makita", "HOF 12-23", 388.50));
        int afterSave = itemDao.getAll().size();
        Assert.assertNotSame(beforeSave, afterSave);

        connection.rollback();

        newItem.setModel("HF 12-23");
        itemDao.update(newItem);

        lecture22.entities.Item updatedItem = itemDao.get(newItem.getId());
        Assert.assertEquals("Метод update не корректен","HF 12-23", updatedItem.getModel());

        lecture22.entities.Item item2 = itemDao.getItemByModelAndSupplier("HF 12-23", "Makita");
        Assert.assertNotNull(item2);

        itemDao.delete(newItem.getId());

        afterSave = itemDao.getAll().size();
        Assert.assertEquals(beforeSave, afterSave);
}
