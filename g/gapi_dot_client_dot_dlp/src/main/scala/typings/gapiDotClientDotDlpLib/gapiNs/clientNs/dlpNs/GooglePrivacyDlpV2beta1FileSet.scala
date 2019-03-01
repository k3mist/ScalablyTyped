package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1FileSet extends js.Object {
  /**
    * The url, in the format `gs://<bucket>/<path>`. Trailing wildcard in the
    * path is allowed.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1FileSet {
  @scala.inline
  def apply(url: java.lang.String = null): GooglePrivacyDlpV2beta1FileSet = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1FileSet]
  }
}

