import org.scalatest.WordSpec
import org.scalatest.matchers.MustMatchers

import org.nicerobot.dynamic._

class PathExample extends WordSpec with MustMatchers {
  val p = new Path().Users.Shared.Documents
  println( p )
}