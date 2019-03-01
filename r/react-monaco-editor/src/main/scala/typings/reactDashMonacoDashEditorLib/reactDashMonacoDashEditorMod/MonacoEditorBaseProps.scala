package typings
package reactDashMonacoDashEditorLib.reactDashMonacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonacoEditorBaseProps extends js.Object {
  /**
    * Optional, allow to pass a different context then the global window onto which the monaco instance will be loaded. Useful if you want to load the editor in an iframe.
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * The initial value of the auto created model in the editor.
    */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Height of editor. Defaults to 500.
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The initial language of the auto created model in the editor. Defaults to 'javascript'.
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional, allow to config loader url and relative path of module, refer to require.config.
    */
  var requireConfig: js.UndefOr[js.Any] = js.undefined
  /**
    * Theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    */
  var theme: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Width of editor. Defaults to 100%.
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object MonacoEditorBaseProps {
  @scala.inline
  def apply(
    context: js.Any = null,
    defaultValue: java.lang.String = null,
    height: java.lang.String | scala.Double = null,
    language: java.lang.String = null,
    requireConfig: js.Any = null,
    theme: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): MonacoEditorBaseProps = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (requireConfig != null) __obj.updateDynamic("requireConfig")(requireConfig)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonacoEditorBaseProps]
  }
}

