package com.pdsa.gamingProject.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Sachith Harshamal
 */
@DisplayName("String Util")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StringUtilTest {

    private static final String TEST_CONTENTED_STRING = "Test String";
    private static final String TEST_EMPTY_STRING = "";

    @Test
    @DisplayName("DateUtil should return true when there is a content on the string")
    void string_util_should_return_true_for_contented_string() {
        boolean response = StringUtil.isStringHasContent(TEST_CONTENTED_STRING);

        assertTrue(response, "response value should be true");
    }

    @Test
    @DisplayName("DateUtil should return false when there is no content on the string")
    void string_util_should_return_false_for_empty_string() {
        boolean response = StringUtil.isStringHasContent(TEST_EMPTY_STRING);

        assertFalse(response, "response value should be false");
    }
}