package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoConverter extends js.Object {
  var converter: js.UndefOr[atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]] = js.undefined
  var tooltipDisplay: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ] = js.undefined
  var tooltipLabel: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AutoConverter {
  @scala.inline
  def apply(
    converter: atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String] = null,
    tooltipDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto = null,
    tooltipLabel: java.lang.String = null
  ): Anon_AutoConverter = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter)
    if (tooltipDisplay != null) __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel)
    __obj.asInstanceOf[Anon_AutoConverter]
  }
}

