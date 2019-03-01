package typings
package istanbulDashLibDashReportLib.istanbulDashLibDashReportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Watermarks extends js.Object {
  var branches: js.Array[scala.Double]
  var functions: js.Array[scala.Double]
  var lines: js.Array[scala.Double]
  var statements: js.Array[scala.Double]
}

object Watermarks {
  @scala.inline
  def apply(
    branches: js.Array[scala.Double],
    functions: js.Array[scala.Double],
    lines: js.Array[scala.Double],
    statements: js.Array[scala.Double]
  ): Watermarks = {
    val __obj = js.Dynamic.literal(branches = branches, functions = functions, lines = lines, statements = statements)
  
    __obj.asInstanceOf[Watermarks]
  }
}

