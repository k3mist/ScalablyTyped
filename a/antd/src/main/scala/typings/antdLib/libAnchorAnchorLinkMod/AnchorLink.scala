package typings
package antdLib.libAnchorAnchorLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorLink
  extends reactLib.reactMod.Component[AnchorLinkProps, js.Any, js.Any] {
  @JSName("context")
  var context_AnchorLink: antdLib.Anon_AntAnchor_1011846465 = js.native
  @JSName("componentDidMount")
  def componentDidMount_MAnchorLink(): scala.Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MAnchorLink(hasHref: AnchorLinkProps): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MAnchorLink(): scala.Unit = js.native
  def handleClick(e: reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, stdLib.MouseEvent]): scala.Unit = js.native
  def renderAnchorLink(hasGetPrefixCls: antdLib.libConfigDashProviderMod.ConfigConsumerProps): reactLib.reactMod.Global.JSXNs.Element = js.native
}

