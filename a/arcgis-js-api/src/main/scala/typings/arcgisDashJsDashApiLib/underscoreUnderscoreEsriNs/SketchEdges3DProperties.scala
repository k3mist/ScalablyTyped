package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchEdges3DProperties extends Edges3DProperties {
  /**
    * For SketchEdges3D the type is always `sketch`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SketchEdges3D.html#type)
    */
  var `type`: js.UndefOr[arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.sketch] = js.undefined
}

object SketchEdges3DProperties {
  @scala.inline
  def apply(
    color: Color | js.Array[scala.Double] | java.lang.String = null,
    extensionLength: scala.Double | java.lang.String = null,
    size: scala.Double | java.lang.String = null,
    `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.sketch = null
  ): SketchEdges3DProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extensionLength != null) __obj.updateDynamic("extensionLength")(extensionLength.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SketchEdges3DProperties]
  }
}

