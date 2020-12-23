package dev.msfjarvis.inlined.static

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EmailAddressTest {

  @Test
  fun `valid email address parses correctly`() {
    assertEquals("me@msfjarvis.dev", EmailAddress.of("me@msfjarvis.dev").value)
    assertEquals("me+alias@msfjarvis.dev", EmailAddress.of("me+alias@msfjarvis.dev").value)
  }

  @Test
  fun `invalid email throws IllegalArgumentException`() {
    assertFailsWith<IllegalArgumentException>("'https://msfjarvis.dev' is not a valid email") {
      EmailAddress.of("https://msfjarvis.dev")
    }
  }

  @Test
  fun `custom validators`() {
    assertFailsWith<IllegalArgumentException>("'me@msfjarvis.dev' is not a valid email") {
      EmailAddress.of("me@msfjarvis.dev") { false }
    }
    assertEquals(
      "totally invalid email address",
      EmailAddress.of("totally invalid email address") { true }.value
    )
  }
}
