package typings
package markedLib.markedMod.markedNs.TokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStart
  extends markedLib.markedMod.markedNs.Token {
  var ordered: scala.Boolean
  var `type`: markedLib.markedLibStrings.list_start
}

object ListStart {
  @scala.inline
  def apply(ordered: scala.Boolean, `type`: markedLib.markedLibStrings.list_start): ListStart = {
    val __obj = js.Dynamic.literal(ordered = ordered, `type` = `type`)
  
    __obj.asInstanceOf[ListStart]
  }
}

