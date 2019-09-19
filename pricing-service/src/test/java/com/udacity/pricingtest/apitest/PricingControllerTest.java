/**
 * 
 */
package com.udacity.pricingtest.apitest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.udacity.pricing.PricingServiceApplication;


/**
 * The Class PricingControllerTest.
 *
 * @author Manmeet Singh
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {PricingServiceApplication.class})
@AutoConfigureMockMvc
public class PricingControllerTest {

    /** The mock mvc. */
    @Autowired
    private MockMvc mockMvc;
    
    /**
     * Test pricing service functionality.
     *
     * @throws Exception the exception
     */
    @Test
    public void testPricingServiceFunctionality() throws Exception{
	
	mockMvc.perform(get("/services/price")
                .param("vehicleId", "1"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(content().json("{}"));
    }

}
