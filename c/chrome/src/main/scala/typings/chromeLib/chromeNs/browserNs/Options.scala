package typings
package chromeLib.chromeNs.browserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** The URL to navigate to when the new tab is initially opened. */
  var url: java.lang.String
}

object Options {
  @scala.inline
  def apply(url: java.lang.String): Options = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[Options]
  }
}

