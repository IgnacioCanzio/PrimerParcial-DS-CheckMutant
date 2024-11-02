package com.example.CheckMutant.serviceTests;
import static org.junit.jupiter.api.Assertions.*;

import com.example.CheckMutant.service.ADNService;
import org.junit.jupiter.api.Test;

public class ADNServiceTests {
    private final ADNService adnService = new ADNService();

    @Test
    void testValidarArray_NullArray() {
        String[] array = null;
        boolean result = adnService.validarArray(array);
        assertFalse(result, "El array nulo debe retornar false");
    }

    @Test
    void testValidarArray_EmptyArray() {
        String[] array = {};
        boolean result = adnService.validarArray(array);
        assertFalse(result, "El array vacío debe retornar false");
    }

    @Test
    void testValidarArray_ShortArray() {
        String[] array = {"ATCG", "ATCG"};
        boolean result = adnService.validarArray(array);
        assertFalse(result, "Un array con menos de 4 secuencias debe retornar false");
    }

    @Test
    void testValidarArray_InvalidCharacters() {
        String[] array = {"ATCG", "ATXG", "ATCG", "ATCG"};
        boolean result = adnService.validarArray(array);
        assertFalse(result, "El array con caracteres no válidos debe retornar false");
    }

    @Test
    void testValidarArray_DifferentLengthStrings() {
        String[] array = {"ATCG", "ATCGG", "ATCG", "ATCG"};
        boolean result = adnService.validarArray(array);
        assertFalse(result, "El array con strings de diferente longitud debe retornar false");
    }

    @Test
    void testValidarArray_ValidArray() {
        String[] array = {"ATCG", "ATCG", "ATCG", "ATCG"};
        boolean result = adnService.validarArray(array);
        assertTrue(result, "El array válido debe retornar true");
    }


}
