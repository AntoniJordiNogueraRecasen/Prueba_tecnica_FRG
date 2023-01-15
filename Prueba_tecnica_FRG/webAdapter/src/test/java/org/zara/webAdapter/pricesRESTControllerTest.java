package org.zara.webAdapter;

import junit.framework.TestCase;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(pricesRESTController.class)
public class pricesRESTControllerTest extends TestCase {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetPricesTesting1() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/prices/start_date/end_date/brand_id/product_id")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"start_date\": \"2020-06-14-10.00.00\", \"end_date\": \"2020-06-14-10.00.00\", \"brand_id\": \"1\", " +
                                "\"product_id\": \"35455\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", Matchers.is(1)));
    }

    @Test
    public void testGetPricesTesting2() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/prices/start_date/end_date/brand_id/product_id")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"start_date\": \"2020-06-14-16.00.00\", \"end_date\": \"2020-06-14-16.00.00\", \"brand_id\": \"1\", " +
                                "\"product_id\": \"35455\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", Matchers.is(2)));
    }

    @Test
    public void testGetPricesTesting3() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/prices/start_date/end_date/brand_id/product_id")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"start_date\": \"2020-06-14-21.00.00\", \"end_date\": \"2020-06-14-21.00.00\", \"brand_id\": \"1\", " +
                                "\"product_id\": \"35455\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", Matchers.is(1)));
    }

    @Test
    public void testGetPricesTesting4() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/prices/start_date/end_date/brand_id/product_id")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"start_date\": \"2020-06-15-10.00.00\", \"end_date\": \"2020-06-15-10.00.00\", \"brand_id\": \"1\", " +
                                "\"product_id\": \"35455\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", Matchers.is(1)));
    }

    @Test
    public void testGetPricesTesting5() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders
                        .get("/prices/start_date/end_date/brand_id/product_id")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"start_date\": \"2020-06-15-21.00.00\", \"end_date\": \"2020-06-15-21.00.00\", \"brand_id\": \"1\", " +
                                "\"product_id\": \"35455\"}"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()", Matchers.is(1)));
    }
}