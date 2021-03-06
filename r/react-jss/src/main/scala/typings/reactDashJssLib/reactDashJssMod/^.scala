package typings
package reactDashJssLib.reactDashJssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jss", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val jss: jssLib.jssMod.JSS = js.native
  def createGenerateClassName(): jssLib.jssMod.GenerateClassName[_] = js.native
  def createTheming[C /* <: java.lang.String */](): themingLib.themingMod.Theming[C] = js.native
  def createTheming[C /* <: java.lang.String */](customChannel: C): themingLib.themingMod.Theming[C] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */, Props](stylesOrCreator: reactDashJssLib.libInjectSheetMod.StyleCreator[C, T, Props]): reactDashJssLib.libInjectSheetMod.PropInjector[
    reactDashJssLib.libInjectSheetMod.WithSheet[C, T, Props], 
    reactDashJssLib.libInjectSheetMod.StyledComponentProps[C]
  ] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */, Props](
    stylesOrCreator: reactDashJssLib.libInjectSheetMod.StyleCreator[C, T, Props],
    options: reactDashJssLib.libInjectSheetMod.InjectOptions
  ): reactDashJssLib.libInjectSheetMod.PropInjector[
    reactDashJssLib.libInjectSheetMod.WithSheet[C, T, Props], 
    reactDashJssLib.libInjectSheetMod.StyledComponentProps[C]
  ] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */, Props](stylesOrCreator: reactDashJssLib.libInjectSheetMod.Styles[C, Props]): reactDashJssLib.libInjectSheetMod.PropInjector[
    reactDashJssLib.libInjectSheetMod.WithSheet[C, T, Props], 
    reactDashJssLib.libInjectSheetMod.StyledComponentProps[C]
  ] = js.native
  def default[C /* <: java.lang.String */, T /* <: js.Object */, Props](
    stylesOrCreator: reactDashJssLib.libInjectSheetMod.Styles[C, Props],
    options: reactDashJssLib.libInjectSheetMod.InjectOptions
  ): reactDashJssLib.libInjectSheetMod.PropInjector[
    reactDashJssLib.libInjectSheetMod.WithSheet[C, T, Props], 
    reactDashJssLib.libInjectSheetMod.StyledComponentProps[C]
  ] = js.native
  def withTheme[P](component: reactLib.reactMod.ReactNs.ComponentType[P with themingLib.Anon_Theme]): reactLib.reactMod.ReactNs.ComponentType[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, reactDashJssLib.reactDashJssLibStrings.theme]]
  ] = js.native
}

