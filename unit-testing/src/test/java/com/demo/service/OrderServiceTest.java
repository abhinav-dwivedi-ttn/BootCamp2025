package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class OrderServiceTest {
    @Mock
    private EmailService emailService;

    @InjectMocks
    private OrderService orderService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testOrderServiceGetInstance() {
        OrderService os1 = OrderService.getInstance();
        OrderService os2 = OrderService.getInstance();
        assertNotNull(os1);
        assertNotNull(os2);
        assertSame(os1, os2);
    }

    @Test
    public void testPlaceOrder() {
        Order ord = new Order(1, "Mobile", 800.0);
        doThrow(new RuntimeException("An Exception Occurred")).when(emailService).sendEmail(ord);
        try {
            orderService.placeOrder(ord);
        }
        catch(Exception e) {
            assertEquals("An Exception Occurred", e.getMessage());
        }
        assertEquals(960.0, ord.getPriceWithTax(), 0.01);
        assertFalse(ord.isCustomerNotified());
        verify(emailService, times(1)).sendEmail(ord);
    }

    @Test
    public void testPlaceOrderWithCC() {
        Order ord = new Order(1, "Mobile", 800.0);
        String email = "example.com";
        when(emailService.sendEmail(ord, email)).thenReturn(true);
        boolean isNotified = orderService.placeOrder(ord, email);
        assertTrue(isNotified);
        verify(emailService, times(1)).sendEmail(ord, email);
    }
}

