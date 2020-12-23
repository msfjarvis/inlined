package dev.msfjarvis.inlined.static

import dev.msfjarvis.inlined.internal.Utils
import java.util.regex.Pattern

/**
 * [EmailAddress] is an inline representation of a [String]-backed email address. Instances can only be constructed
 * via the static [of] methods, and unlike the [dev.msfjarvis.inlined.EmailAddress] class this provides an overload
 * to supply your own validation logic.
 */
inline class EmailAddress private constructor(val value: String) {
  override fun toString() = value

  companion object {
    /**
     * Validates [value] against an internal regular expression and returns an [EmailAddress] if it was valid,
     * throws [IllegalArgumentException] otherwise.
     */
    fun of(value: String): EmailAddress {
      require(Pattern.matches(Utils.EMAIL_REGEX, value)) { "'$value' is not a valid email" }
      return EmailAddress(value)
    }

    /**
     * Validates [value] against the provided [validator] and returns an [EmailAddress] if it was valid,
     * throws [IllegalArgumentException] otherwise.
     */
    fun of(value: String, validator: (String) -> Boolean): EmailAddress {
      require(validator.invoke(value)) { "'$value' is not a valid email" }
      return EmailAddress(value)
    }
  }
}
