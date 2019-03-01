package typings
package chromeLib.chromeNs.inputNs.imeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitTextParameters extends js.Object {
  /** ID of the context where the text will be committed */
  var contextID: scala.Double
  /** The text to commit */
  var text: java.lang.String
}

object CommitTextParameters {
  @scala.inline
  def apply(contextID: scala.Double, text: java.lang.String): CommitTextParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID, text = text)
  
    __obj.asInstanceOf[CommitTextParameters]
  }
}

