package typings
package i18nextDashExpressDashMiddlewareLib.i18nextDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nextExpressMiddleware extends js.Object {
  def LanguageDetector(): expressLib.expressMod.eNs.Handler
  def missingKeyHandler(): expressLib.expressMod.eNs.Handler
}

object i18nextExpressMiddleware {
  @scala.inline
  def apply(
    LanguageDetector: js.Function0[expressLib.expressMod.eNs.Handler],
    missingKeyHandler: js.Function0[expressLib.expressMod.eNs.Handler]
  ): i18nextExpressMiddleware = {
    val __obj = js.Dynamic.literal(LanguageDetector = LanguageDetector, missingKeyHandler = missingKeyHandler)
  
    __obj.asInstanceOf[i18nextExpressMiddleware]
  }
}

