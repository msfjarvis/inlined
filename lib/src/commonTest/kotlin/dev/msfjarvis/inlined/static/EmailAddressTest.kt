package dev.msfjarvis.inlined.static

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EmailAddressTest {

  @Test
  fun valid_email_address_parses_correctly() {
    assertEquals("me@msfjarvis.dev", EmailAddress.of("me@msfjarvis.dev").value)
    assertEquals("me+alias@msfjarvis.dev", EmailAddress.of("me+alias@msfjarvis.dev").value)
  }

  @Test
  fun invalid_email_throws_IllegalArgumentException() {
    assertFailsWith<IllegalArgumentException>("'https://msfjarvis.dev' is not a valid email") {
      EmailAddress.of("https://msfjarvis.dev")
    }
  }

  @Test
  fun custom_validators() {
    assertFailsWith<IllegalArgumentException>("'me@msfjarvis.dev' is not a valid email") {
      EmailAddress.of("me@msfjarvis.dev") { false }
    }
    assertEquals(
      "totally invalid email address",
      EmailAddress.of("totally invalid email address") { true }.value
    )
  }
}
