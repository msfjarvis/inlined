package dev.msfjarvis.inlined

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EmailAddressTest {

  @Test
  fun valid_email_address_parses_correctly() {
    assertEquals("me@msfjarvis.dev", EmailAddress("me@msfjarvis.dev").value)
    assertEquals("me+alias@msfjarvis.dev", EmailAddress("me+alias@msfjarvis.dev").value)
  }

  @Test
  fun invalid_email_throws_IllegalArgumentException() {
    assertFailsWith<IllegalArgumentException>("'https://msfjarvis.dev' is not a valid email") {
      EmailAddress("https://msfjarvis.dev")
    }
  }
}
