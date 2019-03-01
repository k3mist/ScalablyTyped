package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1OperationConfig extends js.Object {
  /** Max number of findings per file, Datastore entity, or database row. */
  var maxItemFindings: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1OperationConfig {
  @scala.inline
  def apply(maxItemFindings: java.lang.String = null): GooglePrivacyDlpV2beta1OperationConfig = {
    val __obj = js.Dynamic.literal()
    if (maxItemFindings != null) __obj.updateDynamic("maxItemFindings")(maxItemFindings)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1OperationConfig]
  }
}

