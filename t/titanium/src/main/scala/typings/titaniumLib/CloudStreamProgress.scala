package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument passed to the callback as a request is transmitted or received.
  */
trait CloudStreamProgress extends js.Object {
  /**
  	 * A value from 0.0-1.0 with the progress of the exchange.
  	 */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The URL for the request, to help identify it.
  	 */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object CloudStreamProgress {
  @scala.inline
  def apply(progress: scala.Int | scala.Double = null, url: java.lang.String = null): CloudStreamProgress = {
    val __obj = js.Dynamic.literal()
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CloudStreamProgress]
  }
}

