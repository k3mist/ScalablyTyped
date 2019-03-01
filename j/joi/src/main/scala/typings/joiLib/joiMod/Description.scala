package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var example: js.UndefOr[js.Array[_]] = js.undefined
  var flags: js.UndefOr[js.Object] = js.undefined
  var invalids: js.UndefOr[js.Array[_]] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var meta: js.UndefOr[js.Array[_]] = js.undefined
  var notes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var options: js.UndefOr[ValidationOptions] = js.undefined
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var `type`: js.UndefOr[Types | java.lang.String] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
  var valids: js.UndefOr[js.Array[_]] = js.undefined
}

object Description {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    description: java.lang.String = null,
    example: js.Array[_] = null,
    flags: js.Object = null,
    invalids: js.Array[_] = null,
    label: java.lang.String = null,
    meta: js.Array[_] = null,
    notes: js.Array[java.lang.String] = null,
    options: ValidationOptions = null,
    tags: js.Array[java.lang.String] = null,
    `type`: Types | java.lang.String = null,
    unit: java.lang.String = null,
    valids: js.Array[_] = null
  ): Description = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (example != null) __obj.updateDynamic("example")(example)
    if (flags != null) __obj.updateDynamic("flags")(flags)
    if (invalids != null) __obj.updateDynamic("invalids")(invalids)
    if (label != null) __obj.updateDynamic("label")(label)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (options != null) __obj.updateDynamic("options")(options)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (valids != null) __obj.updateDynamic("valids")(valids)
    __obj.asInstanceOf[Description]
  }
}

