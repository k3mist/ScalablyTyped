package typings
package pegjsLib.pegjsMod.PEGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyntaxError extends js.Object {
  var column: scala.Double
  var expected: js.Array[_]
  var found: js.Any
  var line: scala.Double
  var location: LocationRange
  var message: java.lang.String
  var name: java.lang.String
  var offset: scala.Double
}

object SyntaxError {
  @scala.inline
  def apply(
    column: scala.Double,
    expected: js.Array[_],
    found: js.Any,
    line: scala.Double,
    location: LocationRange,
    message: java.lang.String,
    name: java.lang.String,
    offset: scala.Double
  ): SyntaxError = {
    val __obj = js.Dynamic.literal(column = column, expected = expected, found = found, line = line, location = location, message = message, name = name, offset = offset)
  
    __obj.asInstanceOf[SyntaxError]
  }
}

