package app.prgghale.friends.signup

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import app.prgghale.friends.MainActivity
import org.junit.Rule
import org.junit.Test

class SignUpTest {

  @get:Rule
  val signUpTestRule = createAndroidComposeRule<MainActivity>()

  @Test
  fun performSingUp() {
    launchSignUpScreen(rule = signUpTestRule) {
      typeEmail("prachan.ghale@gmail.com")
      typePassword("password")
      submit()
    } verify {
      timelineScreenIsPresent()
    }
  }
}