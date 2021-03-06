package typings
package reactDashBigDashCalendarLib.reactDashBigDashCalendarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateLocalizerSpec extends js.Object {
  var formats: Formats
  var propType: js.UndefOr[propDashTypesLib.propDashTypesMod.Validator[_]] = js.undefined
  def firstOfWeek(culture: Culture): scala.Double
  def format(value: FormatInput, format: java.lang.String, culture: Culture): java.lang.String
}

object DateLocalizerSpec {
  @scala.inline
  def apply(
    firstOfWeek: Culture => scala.Double,
    format: (FormatInput, java.lang.String, Culture) => java.lang.String,
    formats: Formats,
    propType: propDashTypesLib.propDashTypesMod.Validator[_] = null
  ): DateLocalizerSpec = {
    val __obj = js.Dynamic.literal(firstOfWeek = js.Any.fromFunction1(firstOfWeek), format = js.Any.fromFunction3(format), formats = formats)
    if (propType != null) __obj.updateDynamic("propType")(propType)
    __obj.asInstanceOf[DateLocalizerSpec]
  }
}

