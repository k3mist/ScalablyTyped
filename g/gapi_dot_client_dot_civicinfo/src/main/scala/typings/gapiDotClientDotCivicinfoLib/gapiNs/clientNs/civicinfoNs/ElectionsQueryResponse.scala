package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectionsQueryResponse extends js.Object {
  /** A list of available elections */
  var elections: js.UndefOr[js.Array[Election]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#electionsQueryResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ElectionsQueryResponse {
  @scala.inline
  def apply(elections: js.Array[Election] = null, kind: java.lang.String = null): ElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (elections != null) __obj.updateDynamic("elections")(elections)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ElectionsQueryResponse]
  }
}

