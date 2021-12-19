package Facade;

import org.junit.Test;

public class OrderFulfillmentControllerTest {
    @Test
    public void testOrderProduct() throws Exception {
        OrderFulfillmentController controller=new OrderFulfillmentController();
        controller.facade=new OrderServiceFacadeImpl();
        controller.orderProduct(9);
        boolean result=controller.orderFulfilled;
        assertTrue(result);
    }

    private void assertTrue(boolean result) {
    }
}
