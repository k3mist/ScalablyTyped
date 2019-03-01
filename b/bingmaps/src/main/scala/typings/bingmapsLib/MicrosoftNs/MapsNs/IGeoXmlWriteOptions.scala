package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoXmlWriteOptions extends js.Object {
  /** The characters to use to create an indent in the XML data. Default: \t */
  var indentChars: js.UndefOr[java.lang.String] = js.undefined
  /** The characters to use to create a new line in the XML data. Default: \r\n */
  var newLineChars: js.UndefOr[java.lang.String] = js.undefined
  /** A boolean indicating if the generated XML should be use new lines and indents to make the generated nicely formatted. Default: true */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating if Location and LocationRect values should be rounded off to 6 decimals. Default: false */
  var roundLocations: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean indicating if the shapes should be made valid before writing. If set to true, will use the
    * Geometry.makeValid function of the SpatialMath module. Default: false
    */
  var validate: js.UndefOr[scala.Boolean] = js.undefined
  /** The XML format to write the shapes to. Default: Kml */
  var xmlFormat: js.UndefOr[GeoXmlFormat] = js.undefined
}

object IGeoXmlWriteOptions {
  @scala.inline
  def apply(
    indentChars: java.lang.String = null,
    newLineChars: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    roundLocations: js.UndefOr[scala.Boolean] = js.undefined,
    validate: js.UndefOr[scala.Boolean] = js.undefined,
    xmlFormat: GeoXmlFormat = null
  ): IGeoXmlWriteOptions = {
    val __obj = js.Dynamic.literal()
    if (indentChars != null) __obj.updateDynamic("indentChars")(indentChars)
    if (newLineChars != null) __obj.updateDynamic("newLineChars")(newLineChars)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (!js.isUndefined(roundLocations)) __obj.updateDynamic("roundLocations")(roundLocations)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    if (xmlFormat != null) __obj.updateDynamic("xmlFormat")(xmlFormat)
    __obj.asInstanceOf[IGeoXmlWriteOptions]
  }
}

