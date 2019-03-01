package typings
package reactDashCodemirrorLib.ReactCodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCodeMirrorProps
  extends reactLib.reactMod.ReactNs.Props[ReactCodeMirror] {
  /** Automatically focuses the editor when it is mounted (default false) */
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  /** Automatically persist changes to underlying textarea (default false) */
  var autoSave: js.UndefOr[scala.Boolean] = js.undefined
  /** Adds a custom CSS class to the editor */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Provides a specific CodeMirror instance (defaults to `require('codemirror')`) */
  var codeMirrorInstance: js.UndefOr[
    js.Function2[
      /* host */ js.Any, 
      /* options */ js.UndefOr[codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration], 
      codemirrorLib.codemirrorMod.CodeMirrorNs.Editor
    ]
  ] = js.undefined
  /** Provides the default (not changed tracked) value to the editor */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /** Set the name of the editor input field */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Called when a change is made */
  var onChange: js.UndefOr[
    js.Function2[
      /* newValue */ java.lang.String, 
      /* change */ codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChange, 
      _
    ]
  ] = js.undefined
  /** Called when the cursor is moved */
  var onCursorActivity: js.UndefOr[
    js.Function1[/* codemirror */ codemirrorLib.codemirrorMod.CodeMirrorNs.Editor, _]
  ] = js.undefined
  /** Called when the editor is focused or loses focus */
  var onFocusChange: js.UndefOr[js.Function1[/* focused */ scala.Boolean, _]] = js.undefined
  /** Called when the editor is scrolled */
  var onScroll: js.UndefOr[
    js.Function1[/* scrollInfo */ codemirrorLib.codemirrorMod.CodeMirrorNs.ScrollInfo, _]
  ] = js.undefined
  /** Options passed to the CodeMirror instance */
  var options: js.UndefOr[codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration] = js.undefined
  /** (DEPRECATED), use `name` */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Preserve previous scroll position after updating value */
  var preserveScrollPosition: js.UndefOr[scala.Boolean] = js.undefined
  /** The editor value */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object ReactCodeMirrorProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    autoSave: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    codeMirrorInstance: js.Function2[
      /* host */ js.Any, 
      /* options */ js.UndefOr[codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration], 
      codemirrorLib.codemirrorMod.CodeMirrorNs.Editor
    ] = null,
    defaultValue: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    name: java.lang.String = null,
    onChange: js.Function2[
      /* newValue */ java.lang.String, 
      /* change */ codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChange, 
      _
    ] = null,
    onCursorActivity: js.Function1[/* codemirror */ codemirrorLib.codemirrorMod.CodeMirrorNs.Editor, _] = null,
    onFocusChange: js.Function1[/* focused */ scala.Boolean, _] = null,
    onScroll: js.Function1[/* scrollInfo */ codemirrorLib.codemirrorMod.CodeMirrorNs.ScrollInfo, _] = null,
    options: codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration = null,
    path: java.lang.String = null,
    preserveScrollPosition: js.UndefOr[scala.Boolean] = js.undefined,
    ref: reactLib.reactMod.ReactNs.LegacyRef[ReactCodeMirror] = null,
    value: java.lang.String = null
  ): ReactCodeMirrorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (codeMirrorInstance != null) __obj.updateDynamic("codeMirrorInstance")(codeMirrorInstance)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onCursorActivity != null) __obj.updateDynamic("onCursorActivity")(onCursorActivity)
    if (onFocusChange != null) __obj.updateDynamic("onFocusChange")(onFocusChange)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (options != null) __obj.updateDynamic("options")(options)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(preserveScrollPosition)) __obj.updateDynamic("preserveScrollPosition")(preserveScrollPosition)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ReactCodeMirrorProps]
  }
}

