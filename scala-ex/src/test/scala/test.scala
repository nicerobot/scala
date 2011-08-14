import org.nicerobot.dynamic._

class DyTest extends App {
  def x = new dy
  val y = x `abc-def` { x what;x another(x pi() sky()) any(1,2,3) }
  val anxml = x .one \{
    x .two \{
        "three"
      }
      .four \{
        "five"
      }
    }
  println(y.getClass)
}
