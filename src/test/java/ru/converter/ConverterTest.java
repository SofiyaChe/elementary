package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
    @Test
    void whenConvert500RblThen5Euro() {
        float in = 500;
        float expected = 5;
        float out = Converter.rubleToEuro(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
    @Test
    void whenConvert750RblThen7Dot5Euro() {
        float in = 750;
        float expected = 7.5f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen2dot2222Dlr() {
        float in = 200;
        float expected = 2.2222f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen2Dlr() {
        float in = 180;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
    @Test
    void whenConvert250RblThen2dot7777Dlr() {
        float in = 250;
        float expected = 2.7777f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

}