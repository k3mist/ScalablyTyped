package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CardUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  def setAuthorizationAction(action: AuthorizationAction): Button
  def setComposeAction(action: Action, composedEmailType: ComposedEmailType): Button
  def setOnClickAction(action: Action): Button
  def setOnClickOpenLinkAction(action: Action): Button
  def setOpenLink(openLink: OpenLink): Button
}

object Button {
  @scala.inline
  def apply(
    setAuthorizationAction: AuthorizationAction => Button,
    setComposeAction: (Action, ComposedEmailType) => Button,
    setOnClickAction: Action => Button,
    setOnClickOpenLinkAction: Action => Button,
    setOpenLink: OpenLink => Button
  ): Button = {
    val __obj = js.Dynamic.literal(setAuthorizationAction = js.Any.fromFunction1(setAuthorizationAction), setComposeAction = js.Any.fromFunction2(setComposeAction), setOnClickAction = js.Any.fromFunction1(setOnClickAction), setOnClickOpenLinkAction = js.Any.fromFunction1(setOnClickOpenLinkAction), setOpenLink = js.Any.fromFunction1(setOpenLink))
  
    __obj.asInstanceOf[Button]
  }
}

