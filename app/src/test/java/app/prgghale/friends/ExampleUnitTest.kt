package app.prgghale.friends

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
  //private lateinit var add: Add
  private val add by lazy {
    Add()
  }

  /*@Before
  fun makeObjects() {
    add = Add()
  }*/

  @Test
  fun `multiple tests are written here`() {

  }

  @Test
  fun test_oddEven() {
    assertTrue(add.isEven(2))
    assertFalse(add.isEven(3))
    this.`multiple tests are written here`()
  }

  @Test
  fun addition_isCorrect() {
    assertEquals(4, 2 + 2)
  }
}

class Add {
  fun isEven(number: Int): Boolean {
    return number % 2 == 0
  }
}

