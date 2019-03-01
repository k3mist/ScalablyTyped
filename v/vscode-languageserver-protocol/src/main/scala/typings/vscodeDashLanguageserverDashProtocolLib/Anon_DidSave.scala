package typings
package vscodeDashLanguageserverDashProtocolLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DidSave extends js.Object {
  /**
    * The client supports did save notifications.
    */
  var didSave: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether text document synchronization supports dynamic registration.
    */
  var dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The client supports sending will save notifications.
    */
  var willSave: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The client supports sending a will save request and
    * waits for a response providing text edits which will
    * be applied to the document before it is saved.
    */
  var willSaveWaitUntil: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DidSave {
  @scala.inline
  def apply(
    didSave: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicRegistration: js.UndefOr[scala.Boolean] = js.undefined,
    willSave: js.UndefOr[scala.Boolean] = js.undefined,
    willSaveWaitUntil: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DidSave = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(didSave)) __obj.updateDynamic("didSave")(didSave)
    if (!js.isUndefined(dynamicRegistration)) __obj.updateDynamic("dynamicRegistration")(dynamicRegistration)
    if (!js.isUndefined(willSave)) __obj.updateDynamic("willSave")(willSave)
    if (!js.isUndefined(willSaveWaitUntil)) __obj.updateDynamic("willSaveWaitUntil")(willSaveWaitUntil)
    __obj.asInstanceOf[Anon_DidSave]
  }
}

