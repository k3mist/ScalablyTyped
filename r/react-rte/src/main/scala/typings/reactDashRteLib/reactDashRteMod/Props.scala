package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var blockStyleFn: js.UndefOr[
    js.Function1[
      /* block */ draftDashJsLib.draftDashJsMod.ContentBlock, 
      js.UndefOr[java.lang.String]
    ]
  ] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var customControls: js.UndefOr[js.Array[reactDashRteLib.CustomControl]] = js.undefined
  var customStyleMap: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Any]]
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var editorClassName: js.UndefOr[java.lang.String] = js.undefined
  var editorStyle: js.UndefOr[js.Object] = js.undefined
  var handleReturn: js.UndefOr[js.Function1[/* event */ js.Object, scala.Boolean]] = js.undefined
  var keyBindingFn: js.UndefOr[js.Function1[/* event */ js.Object, js.UndefOr[java.lang.String]]] = js.undefined
  var onChange: js.UndefOr[reactDashRteLib.ChangeHandler] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var rootStyle: js.UndefOr[js.Object] = js.undefined
  var toolbarClassName: js.UndefOr[java.lang.String] = js.undefined
   // Alias of readOnly
  var toolbarConfig: js.UndefOr[ToolbarConfig] = js.undefined
  var toolbarStyle: js.UndefOr[js.Object] = js.undefined
  var value: EditorValue
}

