package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EsriJSONOptions extends js.Object {
  var geometryName: js.UndefOr[java.lang.String] = js.undefined
}

object EsriJSONOptions {
  @scala.inline
  def apply(geometryName: java.lang.String = null): EsriJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    __obj.asInstanceOf[EsriJSONOptions]
  }
}

