package typings
package stylusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BlockColumnFilename extends js.Object {
  var __type: java.lang.String
  var block: stylusLib.stylusMod.StylusNs.NodesNs.Block
  var column: scala.Double
  var filename: java.lang.String
  var lineno: scala.Double
  var prefix: java.lang.String
  var segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
}

object Anon_BlockColumnFilename {
  @scala.inline
  def apply(
    __type: java.lang.String,
    block: stylusLib.stylusMod.StylusNs.NodesNs.Block,
    column: scala.Double,
    filename: java.lang.String,
    lineno: scala.Double,
    prefix: java.lang.String,
    segments: js.Array[stylusLib.stylusMod.StylusNs.NodesNs.Node]
  ): Anon_BlockColumnFilename = {
    val __obj = js.Dynamic.literal(__type = __type, block = block, column = column, filename = filename, lineno = lineno, prefix = prefix, segments = segments)
  
    __obj.asInstanceOf[Anon_BlockColumnFilename]
  }
}

