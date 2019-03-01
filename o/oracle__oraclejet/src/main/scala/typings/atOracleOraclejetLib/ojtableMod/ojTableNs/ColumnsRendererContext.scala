package typings
package atOracleOraclejetLib.ojtableMod.ojTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ColumnsRendererContext[K, D] extends js.Object {
  var cellContext: atOracleOraclejetLib.Anon_Datasource[K, D]
  var columnIndex: scala.Double
  var componentElement: stdLib.Element
  var data: D
  var parentElement: stdLib.Element
  var row: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object ColumnsRendererContext {
  @scala.inline
  def apply[K, D](
    cellContext: atOracleOraclejetLib.Anon_Datasource[K, D],
    columnIndex: scala.Double,
    componentElement: stdLib.Element,
    data: D,
    parentElement: stdLib.Element,
    row: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): ColumnsRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(cellContext = cellContext, columnIndex = columnIndex, componentElement = componentElement, data = data.asInstanceOf[js.Any], parentElement = parentElement, row = row)
  
    __obj.asInstanceOf[ColumnsRendererContext[K, D]]
  }
}

