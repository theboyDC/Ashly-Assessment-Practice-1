package za.co.wethinkcode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Fundamentals")
class FundamentalsTest {

    // ============================
    // Question 1 — isPrime
    // ============================
    @Nested
    @DisplayName("isPrime()")
    class IsPrimeTests {

        @ParameterizedTest(name = "{0} is not prime")
        @ValueSource(ints = {-10, -1, 0, 1, 4, 6, 8, 9, 10, 25, 100})
        @DisplayName("Returns false for non-prime numbers")
        void returnsFalseForNonPrimes(int n) {
            assertFalse(Fundamentals.isPrime(n));
        }

        @ParameterizedTest(name = "{0} is prime")
        @ValueSource(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 97})
        @DisplayName("Returns true for prime numbers")
        void returnsTrueForPrimes(int n) {
            assertTrue(Fundamentals.isPrime(n));
        }
    }

    // ============================
    // Question 2 — sumArray
    // ============================
    @Nested
    @DisplayName("sumArray()")
    class SumArrayTests {

        @ParameterizedTest(name = "sumArray({0}) == {1}")
        @MethodSource("sumArrayProvider")
        @DisplayName("Returns correct sum for valid arrays")
        void returnsCorrectSum(int[] arr, int expected) {
            assertEquals(expected, Fundamentals.sumArray(arr));
        }

        static Stream<Arguments> sumArrayProvider() {
            return Stream.of(
                    Arguments.of(new int[]{1, 2, 3},          6),
                    Arguments.of(new int[]{0, 0, 0},          0),
                    Arguments.of(new int[]{-1, -2, -3},      -6),
                    Arguments.of(new int[]{-1, 1},            0),
                    Arguments.of(new int[]{100},            100),
                    Arguments.of(new int[]{1, 2, 3, 4, 5},  15)
            );
        }

        @ParameterizedTest(name = "returns 0 for empty input")
        @MethodSource("emptyArrayProvider")
        @DisplayName("Returns 0 for null or empty arrays")
        void returnsZeroForNullOrEmpty(int[] arr) {
            assertEquals(0, Fundamentals.sumArray(arr));
        }

        static Stream<Arguments> emptyArrayProvider() {
            return Stream.of(
                    Arguments.of((Object) null),
                    Arguments.of(new int[]{})
            );
        }
    }

    // ============================
    // Question 3 — categoriseScore
    // ============================
    @Nested
    @DisplayName("categoriseScore()")
    class CategoriseScoreTests {

        @ParameterizedTest(name = "score {0} → \"{1}\"")
        @MethodSource("scoreProvider")
        @DisplayName("Returns correct grade for each score band")
        void returnsCorrectGrade(int score, String expected) {
            assertEquals(expected, Fundamentals.categoriseScore(score));
        }

        static Stream<Arguments> scoreProvider() {
            return Stream.of(
                    // boundary values — invalid
                    Arguments.of(-1,  "Invalid"),
                    Arguments.of(101, "Invalid"),
                    // boundary values — Distinction
                    Arguments.of(90,  "Distinction"),
                    Arguments.of(100, "Distinction"),
                    Arguments.of(95,  "Distinction"),
                    // boundary values — Merit
                    Arguments.of(75,  "Merit"),
                    Arguments.of(89,  "Merit"),
                    Arguments.of(80,  "Merit"),
                    // boundary values — Pass
                    Arguments.of(50,  "Pass"),
                    Arguments.of(74,  "Pass"),
                    Arguments.of(60,  "Pass"),
                    // boundary values — Fail
                    Arguments.of(0,   "Fail"),
                    Arguments.of(49,  "Fail"),
                    Arguments.of(25,  "Fail")
            );
        }
    }

    // ============================
    // Question 4 — countVowels
    // ============================
    @Nested
    @DisplayName("countVowels()")
    class CountVowelsTests {

        @ParameterizedTest(name = "countVowels({0}) == {1}")
        @MethodSource("vowelProvider")
        @DisplayName("Returns correct vowel count")
        void returnsCorrectCount(String input, int expected) {
            assertEquals(expected, Fundamentals.countVowels(input));
        }

        static Stream<Arguments> vowelProvider() {
            return Stream.of(
                    Arguments.of("hello",         2),
                    Arguments.of("HELLO",         2),
                    Arguments.of("HeLLo WoRLd",   3),
                    Arguments.of("rhythm",         0),
                    Arguments.of("aeiou",          5),
                    Arguments.of("AEIOU",          5),
                    Arguments.of("a",              1),
                    Arguments.of("b",              0),
                    Arguments.of("hello world",    3)
            );
        }

        @ParameterizedTest(name = "returns 0 for null or empty input")
        @NullAndEmptySource
        @DisplayName("Returns 0 for null or empty strings")
        void returnsZeroForNullOrEmpty(String input) {
            assertEquals(0, Fundamentals.countVowels(input));
        }
    }
}