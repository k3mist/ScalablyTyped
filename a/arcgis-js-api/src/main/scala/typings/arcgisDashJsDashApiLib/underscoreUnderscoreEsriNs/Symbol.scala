package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol
  extends Accessor
     with JSONSupport {
  /**
    * The color of the symbol. This can be autocast with a named string; hex string; array of rgb or rgba values; an object with `r`, `g`, `b`, and `a` properties; or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    *
    * @default black
    */
  var color: Color = js.native
  /**
    * The symbol type.  **Possible values:** simple-marker | picture-marker | simple-line | cartographic-line-symbol |  simple-fill | picture-fill | text | shield-label-symbol | point-3d | line-3d | polygon-3d | mesh-3d | label-3d
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#type)
    */
  val `type`: java.lang.String = js.native
}

@JSGlobal("__esri.Symbol")
@js.native
object Symbol extends SymbolConstructor

