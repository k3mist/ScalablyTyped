package typings
package reactDashIntlLib.ReactIntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ReactIntl")
@js.native
object ^ extends js.Object {
  val intlShape: IntlShape = js.native
  def addLocaleData(data: js.Array[Locale]): scala.Unit = js.native
  def addLocaleData(data: Locale): scala.Unit = js.native
  def defineMessages[Names /* <: java.lang.String */](messages: Messages[Names]): Messages[Names] = js.native
  def injectIntl[P](component: reactLib.reactMod.ReactNs.ComponentType[P with InjectedIntlProps]): (reactLib.reactMod.ReactNs.ComponentClass[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactDashIntlLib.reactDashIntlLibStrings.intl]], 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashIntlLib.Anon_WrappedComponent[P] = js.native
  def injectIntl[P](
    component: reactLib.reactMod.ReactNs.ComponentType[P with InjectedIntlProps],
    options: InjectIntlConfig
  ): (reactLib.reactMod.ReactNs.ComponentClass[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactDashIntlLib.reactDashIntlLibStrings.intl]], 
    reactLib.reactMod.ReactNs.ComponentState
  ]) with reactDashIntlLib.Anon_WrappedComponent[P] = js.native
}

