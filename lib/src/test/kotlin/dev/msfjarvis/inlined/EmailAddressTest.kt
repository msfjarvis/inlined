package dev.msfjarvis.inlined

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EmailAddressTest {

  @Test
  fun `valid email address parses correctly`() {
    assertEquals("me@msfjarvis.dev", EmailAddress("me@msfjarvis.dev").value)
    assertEquals("me+alias@msfjarvis.dev", EmailAddress("me+alias@msfjarvis.dev").value)
  }

  @Test
  fun `invalid email throws IllegalArgumentException`() {
    assertFailsWith<IllegalArgumentException>("'https://msfjarvis.dev' is not a valid email") {
      EmailAddress("https://msfjarvis.dev")
    }
  }
}
