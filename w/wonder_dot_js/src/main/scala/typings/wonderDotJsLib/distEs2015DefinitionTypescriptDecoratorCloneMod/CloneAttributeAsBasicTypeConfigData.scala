package typings
package wonderDotJsLib.distEs2015DefinitionTypescriptDecoratorCloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneAttributeAsBasicTypeConfigData extends js.Object {
  var order: js.UndefOr[scala.Double] = js.undefined
}

object CloneAttributeAsBasicTypeConfigData {
  @scala.inline
  def apply(order: scala.Int | scala.Double = null): CloneAttributeAsBasicTypeConfigData = {
    val __obj = js.Dynamic.literal()
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneAttributeAsBasicTypeConfigData]
  }
}

