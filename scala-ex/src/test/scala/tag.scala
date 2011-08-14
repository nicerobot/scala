import org.scalatest.WordSpec
import org.scalatest.matchers.MustMatchers

import org.nicerobot.dynamic._

class ExampleSpec extends WordSpec with MustMatchers {
  val x = tag
  val anxml = x .one
  println(anxml)
}
