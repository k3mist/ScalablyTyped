package typings
package reactDashAutosuggestLib.reactDashAutosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AutosuggestNs {
  // types for functions - allowing reuse externally - e.g. as props and bound in the constructor
  type GetSectionSuggestions[TSuggestion] = js.Function1[/* section */ js.Any, js.Array[TSuggestion]]
  type GetSuggestionValue[TSuggestion] = js.Function1[/* suggestion */ TSuggestion, java.lang.String]
  /**
    * Utilies types based on:
    * https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-307871458
    */
  /** @internal */
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[
    T, 
    /* import warning: ImportType.apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  type OnSuggestionHighlighted = js.Function1[/* params */ SuggestionHighlightedParams, scala.Unit]
  type OnSuggestionSelected[TSuggestion] = js.Function2[
    /* event */ reactLib.reactMod.ReactNs.FormEvent[js.Any], 
    /* data */ SuggestionSelectedEventData[TSuggestion], 
    scala.Unit
  ]
  type OnSuggestionsClearRequested = js.Function0[scala.Unit]
  type RenderInputComponent[TSuggestion] = js.Function1[/* inputProps */ InputProps[TSuggestion], reactLib.reactMod.ReactNs.ReactNode]
  type RenderSectionTitle = js.Function1[/* section */ js.Any, reactLib.reactMod.ReactNs.ReactNode]
  type RenderSuggestion[TSuggestion] = js.Function2[
    /* suggestion */ TSuggestion, 
    /* params */ RenderSuggestionParams, 
    reactLib.reactMod.ReactNs.ReactNode
  ]
  type RenderSuggestionsContainer = js.Function1[/* params */ RenderSuggestionsContainerParams, reactLib.reactMod.ReactNs.ReactNode]
  type ShouldRenderSuggestions = js.Function1[/* value */ java.lang.String, scala.Boolean]
  type SuggestionsFetchRequested = js.Function1[/* request */ SuggestionsFetchRequestedParams, scala.Unit]
  type Theme = (stdLib.Record[java.lang.String, java.lang.String | reactLib.reactMod.ReactNs.CSSProperties]) | (stdLib.Partial[
    stdLib.Record[ThemeKey, java.lang.String | reactLib.reactMod.ReactNs.CSSProperties]
  ])
}
