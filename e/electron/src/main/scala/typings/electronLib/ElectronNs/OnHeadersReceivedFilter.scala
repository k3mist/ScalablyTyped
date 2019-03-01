package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeadersReceivedFilter extends js.Object {
  /**
    * Array of URL patterns that will be used to filter out the requests that do not
    * match the URL patterns.
    */
  var urls: js.Array[java.lang.String]
}

object OnHeadersReceivedFilter {
  @scala.inline
  def apply(urls: js.Array[java.lang.String]): OnHeadersReceivedFilter = {
    val __obj = js.Dynamic.literal(urls = urls)
  
    __obj.asInstanceOf[OnHeadersReceivedFilter]
  }
}

