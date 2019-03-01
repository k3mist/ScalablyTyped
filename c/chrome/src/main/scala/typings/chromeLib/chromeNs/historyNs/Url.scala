package typings
package chromeLib.chromeNs.historyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Url extends js.Object {
  /** The URL for the operation. It must be in the format as returned from a call to history.search. */
  var url: java.lang.String
}

object Url {
  @scala.inline
  def apply(url: java.lang.String): Url = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[Url]
  }
}

