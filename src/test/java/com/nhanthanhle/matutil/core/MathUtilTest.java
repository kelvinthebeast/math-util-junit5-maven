package com.nhanthanhle.matutil.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// import static là dành riêng cho những hàm static
// gọi hàm bỏ qua class
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.nhanthanhle.matutil.core.MathUtil.*;
import org.junit.jupiter.*;

/// Data driven testing, test data ra khỏi câu lệnh kiểm thử, tham số hóa data này
// vào trong câu lệnh kiểm thử
public class MathUtilTest {

    //chuẩn bị data
    public static Object[][] initData() {
        return new Object[][] {
            {1, 1},
            {2, 2},
            {5, 120},
            {6, 720},
        };
    }
    @ParameterizedTest
    @MethodSource(value = "initData") // tên hàm cung cấp data, ngầm định thứ tự
    //của các phần tử mảng, map vào tham số hàm
    public void testGetFactorialGivenRightArgsReturnWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }

    // bắt ngoại lệ khi đưa data cà chớn!!
    //@Test(expected = lỗi.class) junit hoy
    @Test
    public void testGetFactorialGivenWrongArgsThrowExp() {
        // hàm nhận 2 object, 1 cái là object có code/ có code impliment
        // 1 cái là functional interface tên excuable: có 1 hàm duy nhất không code tên excute
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(21);});
    }
}
