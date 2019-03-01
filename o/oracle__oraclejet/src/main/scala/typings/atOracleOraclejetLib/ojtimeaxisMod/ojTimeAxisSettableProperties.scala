package typings
package atOracleOraclejetLib.ojtimeaxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTimeAxisSettableProperties
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var converter: atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String]
  var end: java.lang.String
  var scale: atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years
  var start: java.lang.String
  @JSName("translations")
  var translations_ojTimeAxisSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
}

object ojTimeAxisSettableProperties {
  @scala.inline
  def apply(
    converter: atOracleOraclejetLib.ojtimeaxisMod.ojTimeAxisNs.Converters | atOracleOraclejetLib.ojvalidationDashBaseMod.Converter[java.lang.String],
    end: java.lang.String,
    scale: atOracleOraclejetLib.atOracleOraclejetLibStrings.seconds | atOracleOraclejetLib.atOracleOraclejetLibStrings.minutes | atOracleOraclejetLib.atOracleOraclejetLibStrings.hours | atOracleOraclejetLib.atOracleOraclejetLibStrings.days | atOracleOraclejetLib.atOracleOraclejetLibStrings.weeks | atOracleOraclejetLib.atOracleOraclejetLibStrings.months | atOracleOraclejetLib.atOracleOraclejetLibStrings.quarters | atOracleOraclejetLib.atOracleOraclejetLibStrings.years,
    start: java.lang.String,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
  ): ojTimeAxisSettableProperties = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], end = end, scale = scale.asInstanceOf[js.Any], start = start, trackResize = trackResize.asInstanceOf[js.Any], translations = translations)
  
    __obj.asInstanceOf[ojTimeAxisSettableProperties]
  }
}

