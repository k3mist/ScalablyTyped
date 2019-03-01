package typings
package vegaDashTypingsLib.typesSpecTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormulaTransform extends _Transform {
  var as: java.lang.String
  var expr: java.lang.String
  var initonly: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.formula
}

object FormulaTransform {
  @scala.inline
  def apply(
    as: java.lang.String,
    expr: java.lang.String,
    `type`: vegaDashTypingsLib.vegaDashTypingsLibStrings.formula,
    initonly: js.UndefOr[scala.Boolean] = js.undefined
  ): FormulaTransform = {
    val __obj = js.Dynamic.literal(as = as, expr = expr, `type` = `type`)
    if (!js.isUndefined(initonly)) __obj.updateDynamic("initonly")(initonly)
    __obj.asInstanceOf[FormulaTransform]
  }
}

