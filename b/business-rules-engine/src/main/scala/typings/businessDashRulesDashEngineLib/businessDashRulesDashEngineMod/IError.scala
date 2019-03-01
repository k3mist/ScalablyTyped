package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IError extends js.Object {
  var ErrorMessage: java.lang.String
  var HasError: scala.Boolean
  var TranslateArgs: js.UndefOr[IErrorTranslateArgs] = js.undefined
}

object IError {
  @scala.inline
  def apply(ErrorMessage: java.lang.String, HasError: scala.Boolean, TranslateArgs: IErrorTranslateArgs = null): IError = {
    val __obj = js.Dynamic.literal(ErrorMessage = ErrorMessage, HasError = HasError)
    if (TranslateArgs != null) __obj.updateDynamic("TranslateArgs")(TranslateArgs)
    __obj.asInstanceOf[IError]
  }
}

