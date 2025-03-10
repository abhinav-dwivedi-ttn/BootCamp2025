package com.demo.service;

import com.demo.domain.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {

    @Mock
    private EmailService emailService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testEmailServiceGetInstance() {
        EmailService es1 = EmailService.getInstance();
        EmailService es2 = EmailService.getInstance();
        assertNotNull(es1);
        assertNotNull(es2);
        assertSame(es1, es2);
    }

    @Test
    public void testSendEmail() {
        Order ord = new Order(1, "Mobile", 800.0);
        doThrow(new RuntimeException("An Exception Occurred")).when(emailService).sendEmail(ord);
        try {
            emailService.sendEmail(ord);
        }
        catch(Exception e) {
            assertEquals("An Exception Occurred", e.getMessage());
        }
        verify(emailService, times(1)).sendEmail(ord);
    }

    @Test
    public void testSendEmailWithCC() {
        Order ord = new Order(1, "Mobile", 800.0);
        String email = "example.com";
        when(emailService.sendEmail(ord, email)).thenReturn(true);
        boolean isNotified = emailService.sendEmail(ord, email);
        assertTrue(isNotified);
        verify(emailService, times(1)).sendEmail(ord, email);
    }
}