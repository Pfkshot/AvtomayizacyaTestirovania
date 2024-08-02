package org.igor.home;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.igor.seminar.ClientEntity;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductsTest extends AbstractTest{
    @Order(1)
    @ParameterizedTest
    @CsvSource({"GOJIRA ROLL", "FUTOMAKI", "SASHIMI SALAD"})
    void getProductById(String menuName) throws SQLException{
        //given
        //тут наверно таблица products должна быть, а не customers
        String sql = "SELECT * FROM customers WHERE menu_name='" + menuName + "'";
        Statement stmt  = getConnection().createStatement();
        String menuNameString = "";
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            menuNameString = rs.getString(3);
        }
        //then
        Assertions.assertEquals(menuName,menuNameString);
    }

    @Test
    @Order(2)
    void addProduct() {
        //given
        ProductsEntity entity = new ProductsEntity();
        entity.setProductId((short) 11);
        entity.setMenuName("Cacao");
        entity.setPrice("150.00");

        //when
        Session session = getSession();
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();

        final Query query = getSession()
                .createNativeQuery("SELECT * FROM products WHERE product_id="+11)
                .addEntity(ProductsEntity.class);
        ProductsEntity creditEntity = (ProductsEntity) query.uniqueResult();
        //then
        Assertions.assertNotNull(creditEntity);
        Assertions.assertEquals("100.00", creditEntity.getPrice());
    }
    @Order(3)
    void getCountTestORM(){
        //given
        //when
        final Query query = getSession().createNativeQuery("Select * from products")
                .addEntity(ProductsEntity.class);
        //then
        Assertions.assertEquals(10, query.getResultList().size());
    }

}
