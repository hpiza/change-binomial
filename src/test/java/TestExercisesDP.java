
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestExercisesDP {

	private final Duration MAX_DURATION = Duration.ofSeconds(2);

	// ========= EJERCICIO 1 =========
	@Test
	@Order(1)
	@Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
	void case01_change_small() {
		int[] coins = { 1, 4, 6 };
		int amount = 13;
		assertEquals(3, ExercisesDP.change(coins, amount));
	}

	@Test
	@Order(2)
	@Timeout(value = 30, unit = TimeUnit.MILLISECONDS)
	void case02_change_small() {
		int[] coins = { 1, 4, 6 };
		int amount = 22;
		assertEquals(4, ExercisesDP.change(coins, amount));
	}

	@Test
	@Order(3)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case03_change_medium() {
		int[] coins = { 1, 4, 6, 9, 13 };
		int amount = 59;
		assertEquals(6, ExercisesDP.change(coins, amount));
	}

	@Test
	@Order(3)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case04_change_medium() {
		int[] coins = { 1, 4, 6, 9, 13 };
		int amount = 98;
		assertEquals(9, ExercisesDP.change(coins, amount));
	}

	@Test
	@Order(3)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case05_change_big() {
		int[] coins = { 1, 4, 6, 9, 13, 17, 24, 30 };
		int amount = 523;
		assertTimeoutPreemptively(MAX_DURATION, () -> {
			assertEquals(18, ExercisesDP.change(coins, amount));
		});
	}

	@Test
	@Order(3)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case06_change_big() {
		int[] coins = { 1, 4, 6, 9, 13, 17, 24, 30, 40, 65, 80 };
		int amount = 4999;
		assertTimeoutPreemptively(MAX_DURATION, () -> {
			assertEquals(64, ExercisesDP.change(coins, amount));
		});
	}

	@Test
	@Order(3)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case07_change_huge() {
		int[] coins = { 1, 4, 6, 9, 13, 17, 24, 30, 40, 65, 80, 95, 150, 200, 300, 450, 500, 800 };
		int amount = 9999;
		assertTimeoutPreemptively(MAX_DURATION, () -> {
			assertEquals(15, ExercisesDP.change(coins, amount));
		});
	}
	
	@Test
	@Order(3)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case08_change_huge() {
		int[] coins = { 1, 4, 6, 9, 13, 17, 24, 30, 40, 65, 80, 95, 150, 200, 300, 450, 500, 800, 900, 1000 };
		int amount = 19999;
		assertTimeoutPreemptively(MAX_DURATION, () -> {
			assertEquals(22, ExercisesDP.change(coins, amount));
		});
	}
	
	@Test
	@Order(4)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case09_binomial_small() {
		assertEquals(10, ExercisesDP.binomial(5, 3));
	}

	@Test
	@Order(4)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case10_binomial_small() {
		assertEquals(21, ExercisesDP.binomial(7, 5));
	}

	@Test
	@Order(4)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case11_binomial_medium() {
		assertEquals(924, ExercisesDP.binomial(12, 6));
	}
	
	@Test
	@Order(4)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case12_binomial_medium() {
		assertEquals(5005, ExercisesDP.binomial(15, 9));
	}
	
	@Test
	@Order(4)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case13_binomial_big() {
		assertTimeoutPreemptively(MAX_DURATION, () -> {
			assertEquals(67_863_915, ExercisesDP.binomial(29, 16));
		});
	}
	
	@Test
	@Order(4)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case14_binomial_big() {
		assertTimeoutPreemptively(MAX_DURATION, () -> {
			assertEquals(1_855_967_520, ExercisesDP.binomial(34, 19));
		});
	}
	
	@Test
	@Order(4)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case15_binomial_huge() {
		assertTimeoutPreemptively(MAX_DURATION, () -> {
			assertEquals(513_791_607_420L, ExercisesDP.binomial(42, 20));
		});
	}
	
	@Test
	@Order(4)
	@Timeout(value = 10, unit = TimeUnit.MILLISECONDS)
	void case16_binomial_huge() {
		assertTimeoutPreemptively(MAX_DURATION, () -> {
			assertEquals(495_918_532_948_104L, ExercisesDP.binomial(52, 26));
		});
	}
}
