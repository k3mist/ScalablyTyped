package typings
package reactDashCreditDashCardsLib.reactDashCreditDashCardsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbackArgument extends js.Object {
  var isValid: scala.Boolean
  var `type`: reactDashCreditDashCardsLib.Anon_Issuer
}

object CallbackArgument {
  @scala.inline
  def apply(isValid: scala.Boolean, `type`: reactDashCreditDashCardsLib.Anon_Issuer): CallbackArgument = {
    val __obj = js.Dynamic.literal(isValid = isValid, `type` = `type`)
  
    __obj.asInstanceOf[CallbackArgument]
  }
}

