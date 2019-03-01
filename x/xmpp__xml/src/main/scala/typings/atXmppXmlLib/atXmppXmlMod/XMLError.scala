package typings
package atXmppXmlLib.atXmppXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMLError
  extends nodeLib.Error {
  val name: atXmppXmlLib.atXmppXmlLibStrings.XMLError
}

object XMLError {
  @scala.inline
  def apply(name: atXmppXmlLib.atXmppXmlLibStrings.XMLError, stack: java.lang.String = null): XMLError = {
    val __obj = js.Dynamic.literal(name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[XMLError]
  }
}

