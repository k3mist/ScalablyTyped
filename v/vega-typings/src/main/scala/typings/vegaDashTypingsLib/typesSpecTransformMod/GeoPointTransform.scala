package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPointTransform extends _Transform {
  var as: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // projection name
  var fields: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
  var projection: java.lang.String
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.geopoint
}

object GeoPointTransform {
  @scala.inline
  def apply(
    fields: (vegaDashTypingsLib.typesSpecUtilMod.Vector2[java.lang.String | TransformField]) | vegaDashTypingsLib.typesSpecSignalMod.SignalRef,
    projection: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.geopoint,
    as: js.Array[java.lang.String] = null
  ): GeoPointTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], projection = projection, `type` = `type`)
    if (as != null) __obj.updateDynamic("as")(as)
    __obj.asInstanceOf[GeoPointTransform]
  }
}

