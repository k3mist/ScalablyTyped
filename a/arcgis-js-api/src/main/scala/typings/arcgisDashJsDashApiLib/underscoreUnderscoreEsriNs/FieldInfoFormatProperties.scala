package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldInfoFormatProperties extends js.Object {
  /**
    * Used only with `Date` fields. Specifies how the date should appear in a popup.  **Possible Values**: short-date | short-date-le | long-date | day-short-month-year | long-month-day-year | short-date-long-time | short-date-le-long-time | short-date-short-time | short-date-le-short-time | short-date-short-time-24 | short-date-le-short-time-24 | short-date-short-time-24 | short-date-le-short-time-24 | long-month-year | short-month-year | year
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo-Format.html#dateFormat)
    */
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used only with `Number` fields. A value of `true` indicates the number should have a digit (or thousands) separator when the value appears in popups. A value of `false` means that no separator will be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo-Format.html#digitSeparator)
    *
    * @default false
    */
  var digitSeparator: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used only with `Number` fields to specify the number of supported decimal places that should appear in popups. Any places beyond this value are rounded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo-Format.html#places)
    */
  var places: js.UndefOr[scala.Double] = js.undefined
}

