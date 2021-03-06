package typings
package d3DashRequestLib.d3DashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DsvRequest extends Request {
  def row[ParsedRow /* <: js.Object */](
    value: js.Function3[
      /* rawRow */ d3DashDsvLib.d3DashDsvMod.DSVRowString[java.lang.String], 
      /* index */ scala.Double, 
      /* columns */ js.Array[java.lang.String], 
      ParsedRow
    ]
  ): DsvRequest = js.native
}

