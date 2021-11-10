package com.kodluyoruz.Controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kodluyoruz.DTO.UserDTO;
import com.kodluyoruz.Entity.User;
import com.kodluyoruz.Service.UserService;
import org.apache.commons.validator.Arg;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@ExtendWith(SpringExtension.class)
@WebMvcTest(UserController.class)
class UserControllerTest {

    private final static String CONTENT_TYPE = "application/json";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private UserService userService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void save() throws Exception{
        UserDTO user = UserDTO.builder()
                .userName("TestUserTugba")
                .userPassword("TestPassword")
                .build();


    }
}