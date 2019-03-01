package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass extends js.Object {
  /**
    * Size of the equivalence class, for example number of rows with the
    * above set of values.
    */
  var equivalenceClassSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set of values defining the equivalence class. One value per
    * quasi-identifier column in the original KAnonymity metric message.
    * The order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.undefined
}

object GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass {
  @scala.inline
  def apply(
    equivalenceClassSize: java.lang.String = null,
    quasiIdsValues: js.Array[GooglePrivacyDlpV2beta1Value] = null
  ): GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    if (equivalenceClassSize != null) __obj.updateDynamic("equivalenceClassSize")(equivalenceClassSize)
    if (quasiIdsValues != null) __obj.updateDynamic("quasiIdsValues")(quasiIdsValues)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1KAnonymityEquivalenceClass]
  }
}

