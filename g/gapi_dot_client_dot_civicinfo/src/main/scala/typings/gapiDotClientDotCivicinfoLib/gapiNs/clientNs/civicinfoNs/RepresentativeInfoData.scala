package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepresentativeInfoData extends js.Object {
  /** Political geographic divisions that contain the requested address. */
  var divisions: js.UndefOr[stdLib.Record[java.lang.String, GeographicDivision]] = js.undefined
  /** Elected offices referenced by the divisions listed above. Will only be present if includeOffices was true in the request. */
  var offices: js.UndefOr[js.Array[Office]] = js.undefined
  /** Officials holding the offices listed above. Will only be present if includeOffices was true in the request. */
  var officials: js.UndefOr[js.Array[Official]] = js.undefined
}

object RepresentativeInfoData {
  @scala.inline
  def apply(
    divisions: stdLib.Record[java.lang.String, GeographicDivision] = null,
    offices: js.Array[Office] = null,
    officials: js.Array[Official] = null
  ): RepresentativeInfoData = {
    val __obj = js.Dynamic.literal()
    if (divisions != null) __obj.updateDynamic("divisions")(divisions)
    if (offices != null) __obj.updateDynamic("offices")(offices)
    if (officials != null) __obj.updateDynamic("officials")(officials)
    __obj.asInstanceOf[RepresentativeInfoData]
  }
}

