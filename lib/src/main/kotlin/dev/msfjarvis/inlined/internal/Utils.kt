package dev.msfjarvis.inlined.internal

/**
 * Common utility code like shared regex patterns.
 */
internal object Utils {
  /**
   * Imported from Android's Patterns class
   *
   * https://cs.android.com/android/platform/superproject/+/master:frameworks/base/core/java/android/util/Patterns.java
   */
  const val EMAIL_REGEX =
    "[a-zA-Z0-9+._%\\-]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+"
}
