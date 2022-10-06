import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPls {

    @Test
    public void firstsTest(){
        Assert.assertEquals("рукa","рука");
    }
    @Test
    public void secondTest(){
        Assert.assertEquals("рукa","рукa");
    }

    @Step("Проверка сложения числа {num1} и числа {num2}")
    public static void checkSubtractionStep(int num1, int num2, int expectedResult) {
        Assert.assertTrue(num1 + num2 == expectedResult, "Результат вычитания не соответствует ожидаемому значению");
    }
    @Step("Проверка разности числа {num1} и числа {num2}")
    public static void checkSubtractionStep1(int num1, int num2, int expectedResult) {
        Assert.assertTrue(num1 - num2 == expectedResult, "Результат вычитания не соответствует ожидаемому значению");
    }
    @Step("Проверка логина")
    public static void checkSubtractionStep2(String log1, String log2) {
        Assert.assertEquals(log1,log2);
    }
    @Step("Проверка пароля")
    public static void checkSubtractionStep3(String pas1, String pas2) {
        Assert.assertEquals(pas1,pas2);
    }
    @Step("Проверка кода")
    public static void checkSubtractionStep4(int pin1, int pin2) {
        Assert.assertEquals(pin1,pin2);
    }
    @Step("Проверка телефона")
    public static void checkSubtractionStep5(String pho1, String pho2){
        Assert.assertEquals(pho1,pho2);
    }
    @Test(testName ="Проверка суммы" )
    public void simpleTest1() {
        checkSubtractionStep(9, 9, 18);
        checkSubtractionStep(534, 1, 535);
    }
    @Test(testName ="Проверка разности" )
    public void simpleTest2() {
        checkSubtractionStep1(9, 6, 3);
        checkSubtractionStep1(19, 18, 1);
    }
    @Test(testName ="Входа на сайт" )
    public void simpleTest3() {
        checkSubtractionStep2("Ivan_vitalevch", "Ivan_vitalevch");
        checkSubtractionStep3("Iv-2345","Iv-2345");
        checkSubtractionStep5("+78005553535","+78005553535");
        checkSubtractionStep4(8495,8495);
    }
    @Epic(value = "Математика")
    @Feature(value = "Простые математические операции")
    @Story(value = "Сложение")
    @Test
    public void sumTest() {
        checkSubtractionStep(5, 4, 9);
    }

    @Epic(value = "Математика")
    @Feature(value = "Простые математические операции")
    @Story(value = "Вычитание")
    @Test
    public void subTest() {
        checkSubtractionStep(8, 2, 6);
    }

    @Epics(value = {@Epic(value = "Математика"), @Epic(value = "Геометрия")})
    @Features(value = {@Feature(value = "Тригонометрия"), @Feature(value = "Простые математические операции")})
    @Stories(value = {@Story(value = "Синус"), @Story(value = "Синусоида")})
    @Test
    public void checkSinTest() {
        checkSubtractionStep(9, 2,4);
    }

}
