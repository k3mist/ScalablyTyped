package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod.AutosuggestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<any> ]: P} & {[ P in 'onChange' | 'onBlur' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<any>] ]: react.react.InputHTMLAttributes<any>[P]} */ trait InputProps[TSuggestion]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var onBlur: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[_], 
      /* params */ js.UndefOr[BlurEvent[TSuggestion]], 
      scala.Unit
    ]
  ] = js.undefined
  var value: java.lang.String
  def onChange(event: reactLib.reactMod.ReactNs.FormEvent[_], params: ChangeEvent): scala.Unit
}

object InputProps {
  @scala.inline
  def apply[TSuggestion](
    onChange: js.Function2[reactLib.reactMod.ReactNs.FormEvent[_], ChangeEvent, scala.Unit],
    value: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onBlur: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[_], 
      /* params */ js.UndefOr[BlurEvent[TSuggestion]], 
      scala.Unit
    ] = null
  ): InputProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(onChange = onChange, value = value)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    __obj.asInstanceOf[InputProps[TSuggestion]]
  }
}

