package typings
package markedLib.markedMod.markedNs.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heading
  extends markedLib.markedMod.markedNs.Token {
  var depth: scala.Double
  var text: java.lang.String
  var `type`: markedLib.markedLibStrings.heading
}

object Heading {
  @scala.inline
  def apply(depth: scala.Double, text: java.lang.String, `type`: markedLib.markedLibStrings.heading): Heading = {
    val __obj = js.Dynamic.literal(depth = depth, text = text, `type` = `type`)
  
    __obj.asInstanceOf[Heading]
  }
}

