package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.Array[scala.Double]
  var indices: js.Array[scala.Double]
  var normals: js.Array[scala.Double]
  var tangents: js.Array[scala.Double]
  var uvs: js.Array[scala.Double]
  var uvs1: js.Array[scala.Double]
}

object Anon_Colors {
  @scala.inline
  def apply(
    colors: js.Array[scala.Double],
    indices: js.Array[scala.Double],
    normals: js.Array[scala.Double],
    tangents: js.Array[scala.Double],
    uvs: js.Array[scala.Double],
    uvs1: js.Array[scala.Double]
  ): Anon_Colors = {
    val __obj = js.Dynamic.literal(colors = colors, indices = indices, normals = normals, tangents = tangents, uvs = uvs, uvs1 = uvs1)
  
    __obj.asInstanceOf[Anon_Colors]
  }
}

