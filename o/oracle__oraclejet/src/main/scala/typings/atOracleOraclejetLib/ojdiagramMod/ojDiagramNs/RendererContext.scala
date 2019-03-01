package typings
package atOracleOraclejetLib.ojdiagramMod.ojDiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RendererContext[K1, D1] extends js.Object {
  var componentElement: stdLib.Element
  var content: atOracleOraclejetLib.Anon_Element
  var data: js.Object
  var id: K1
  var itemData: D1
  var parentElement: stdLib.Element
  var previousState: atOracleOraclejetLib.Anon_Expanded
  var state: atOracleOraclejetLib.Anon_Expanded
  var `type`: java.lang.String
  def renderDefaultFocus(): scala.Unit
  def renderDefaultHover(): scala.Unit
  def renderDefaultSelection(): scala.Unit
}

object RendererContext {
  @scala.inline
  def apply[K1, D1](
    componentElement: stdLib.Element,
    content: atOracleOraclejetLib.Anon_Element,
    data: js.Object,
    id: K1,
    itemData: D1,
    parentElement: stdLib.Element,
    previousState: atOracleOraclejetLib.Anon_Expanded,
    renderDefaultFocus: js.Function0[scala.Unit],
    renderDefaultHover: js.Function0[scala.Unit],
    renderDefaultSelection: js.Function0[scala.Unit],
    state: atOracleOraclejetLib.Anon_Expanded,
    `type`: java.lang.String
  ): RendererContext[K1, D1] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, content = content, data = data, id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], parentElement = parentElement, previousState = previousState, renderDefaultFocus = renderDefaultFocus, renderDefaultHover = renderDefaultHover, renderDefaultSelection = renderDefaultSelection, state = state, `type` = `type`)
  
    __obj.asInstanceOf[RendererContext[K1, D1]]
  }
}

