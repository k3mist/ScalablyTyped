package typings
package chromeLib.chromeNs.managementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconInfo extends js.Object {
  /** A number representing the width and height of the icon. Likely values include (but are not limited to) 128, 48, 24, and 16. */
  var size: scala.Double
  /** The URL for this icon image. To display a grayscale version of the icon (to indicate that an extension is disabled, for example), append ?grayscale=true to the URL. */
  var url: java.lang.String
}

object IconInfo {
  @scala.inline
  def apply(size: scala.Double, url: java.lang.String): IconInfo = {
    val __obj = js.Dynamic.literal(size = size, url = url)
  
    __obj.asInstanceOf[IconInfo]
  }
}

