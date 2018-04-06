package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    private List<Item> items = new ArrayList<>();

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("2018/04/01");

        Item item1 = new Item(new BigDecimal(100), 2, new BigDecimal(200));
        Item item2 = new Item(new BigDecimal(100), 5, new BigDecimal(500));
        Item item3 = new Item(new BigDecimal(300), 2, new BigDecimal(600));

        Product product1 = new Product("Wood");
        Product product2 = new Product("Steel");

        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        items.add(item1);
        items.add(item2);
        items.add(item3);

        invoice.setItems(items);

        //When
        productDao.save(product1);
        productDao.save(product2);
        Long p1Id = product1.getId();
        Long p2Id = product2.getId();

        invoiceDao.save(invoice);
        Long invoiceId = invoice.getId();

        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        Long i1Id = item1.getId();
        Long i2Id = item2.getId();
        Long i3Id = item3.getId();

        //Then
        Assert.assertNotEquals(null, invoiceId);

        //CleanUp
        productDao.delete(p1Id);
        productDao.delete(p2Id);
        invoiceDao.delete(invoiceId);
        itemDao.delete(i1Id);
        itemDao.delete(i2Id);
        itemDao.delete(i3Id);
    }
}
