package typings
package emotionDashThemingLib.emotionDashThemingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmotionTheming[Theme] extends js.Object {
  def ThemeProvider(props: ThemeProviderProps[Theme]): reactLib.reactMod.ReactNs.ReactElement[_]
  def withTheme[C /* <: reactLib.reactMod.ReactNs.ComponentType[_] */](component: C): reactLib.reactMod.ReactNs.SFC[
    emotionDashThemingLib.typesHelperMod.AddOptionalTo[
      emotionDashThemingLib.typesHelperMod.PropsOf[C], 
      emotionDashThemingLib.emotionDashThemingLibStrings.theme
    ]
  ]
}

object EmotionTheming {
  @scala.inline
  def apply[Theme](
    ThemeProvider: js.Function1[ThemeProviderProps[Theme], reactLib.reactMod.ReactNs.ReactElement[_]],
    withTheme: js.Function1[
      js.Any, 
      reactLib.reactMod.ReactNs.SFC[
        emotionDashThemingLib.typesHelperMod.AddOptionalTo[
          emotionDashThemingLib.typesHelperMod.PropsOf[js.Any], 
          emotionDashThemingLib.emotionDashThemingLibStrings.theme
        ]
      ]
    ]
  ): EmotionTheming[Theme] = {
    val __obj = js.Dynamic.literal(ThemeProvider = ThemeProvider, withTheme = withTheme)
  
    __obj.asInstanceOf[EmotionTheming[Theme]]
  }
}

