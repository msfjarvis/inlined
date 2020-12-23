package dev.msfjarvis.inlined

import dev.msfjarvis.inlined.internal.Utils

/**
 * [EmailAddress] is an inline representation of a [String]-backed email address. It attempts to validate the [value]
 * field using an internal regular expression. If you want to supply your own validation logic, use [dev.msfjarvis.inlined.static.EmailAddress].
 */
inline class EmailAddress(val value: String) {
  override fun toString() = value

  init {
    require(Utils.EMAIL_REGEX.matches(value)) { "'$value' is not a valid email" }
  }
}
