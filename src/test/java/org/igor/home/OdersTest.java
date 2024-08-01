package org.igor.home;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OdersTest extends AbstractTest {

    @Test
    @Order(1)
    void addOrder() {
        //given
        OrdersEntity entity = new OrdersEntity();
        CustomersEntity entityC = new CustomersEntity();
        entity.setOrderId((short) 16);
        entity.setDateGet("2024-07-31");
        entityC.setCustomerId((short) 16);

        //when
        Session session = getSession();
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();

        final Query query = getSession()
                .createNativeQuery("SELECT * FROM orders WHERE order_id="+ 16)
                .addEntity(OrdersEntity.class);
        OrdersEntity creditEntity = (OrdersEntity) query.uniqueResult();
        //then
        Assertions.assertNotNull(creditEntity);
        Assertions.assertEquals("2024-07-31", creditEntity.getDateGet());
    }

    @Test
    @Order(2)
    void getOrder() throws SQLException {
        //given
        String sql = "SELECT * FROM orders WHERE order_id= 5 ";
        Statement stmt  = getConnection().createStatement();
        int countTableSize = 0;
        //when
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            countTableSize++;
        }
        final Query query = getSession().createNativeQuery("SELECT * FROM orders")
                .addEntity(OrdersEntity.class);
        //then
        Assertions.assertEquals(8, countTableSize);
        Assertions.assertEquals(15, query.list().size());
    }
    @Order(3)
    void getCountTestORM(){
        //given
        //when
        final Query query = getSession().createNativeQuery("Select * from orders")
                .addEntity(OrdersEntity.class);
        //then
        Assertions.assertEquals(15, query.getResultList().size());
    }

}
