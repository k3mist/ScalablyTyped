package typings
package imapDashSimpleLib.imapDashSimpleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageBodyPart
  extends imapLib.imapMod.ConnectionNs.ImapMessageBodyInfo {
  /** string type where which=='TEXT', complex Object where which=='HEADER' */
  var body: js.Any
}

object MessageBodyPart {
  @scala.inline
  def apply(body: js.Any, size: scala.Double, which: java.lang.String): MessageBodyPart = {
    val __obj = js.Dynamic.literal(body = body, size = size, which = which)
  
    __obj.asInstanceOf[MessageBodyPart]
  }
}

