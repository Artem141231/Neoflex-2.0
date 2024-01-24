package ru.neoflex.practice.controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
// класс предназначен для тестирования MVC контроллера
@WebMvcTest(CalcController.class)
class CalcControllerMockMvcTest {
    @Autowired
    private MockMvc mockMvc;
    // Тест для сложения
    @Test
    void testAddition() throws Exception {
        // Выполняем запрос "/plus/{a}/{b}" с параметрами 3 и 5
        mockMvc.perform(get("/plus/{a}/{b}", 3, 5))
                // Проверяем что значение 8
                .andExpect(jsonPath("$").value(8));
    }
    // Тест для вычитания
    @Test
    void testSubtraction() throws Exception {
        // Выполняем запрос "/minus/{a}/{b}" с параметрами 8 и 3
        mockMvc.perform(get("/minus/{a}/{b}", 8, 3))
                // Проверяем что значение равно 5
                .andExpect(jsonPath("$").value(5));
    }
}
