import Console._

enum Color
  case Red, Green, Blue

def colorize(s: String)(given Color): String =
  summon match
    case Color.Red => s"$RED$s$RESET"
    case Color.Green => s"$GREEN$s$RESET"
    case Color.Blue => s"$BLUE$s$RESET"

@main def hello =
  given color: Color = Color.Red
  println(colorize("hello, world"))
