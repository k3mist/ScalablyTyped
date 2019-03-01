package typings
package magicDashStringLib.magicDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndentOptions extends js.Object {
  var exclude: ExclusionRange | js.Array[ExclusionRange]
  var indentStart: scala.Boolean
}

object IndentOptions {
  @scala.inline
  def apply(exclude: ExclusionRange | js.Array[ExclusionRange], indentStart: scala.Boolean): IndentOptions = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], indentStart = indentStart)
  
    __obj.asInstanceOf[IndentOptions]
  }
}

