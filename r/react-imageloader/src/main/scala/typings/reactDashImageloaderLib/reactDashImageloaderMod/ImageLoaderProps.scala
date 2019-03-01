package typings
package reactDashImageloaderLib.reactDashImageloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLoaderProps
  extends reactLib.reactMod.ReactNs.Props[ImageLoader] {
  /** An optional class name for the wrapper component. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** An optional object containing props for the underlying img component. */
  var imgProps: js.UndefOr[js.Any] = js.undefined
  /** An optional handler for the error event. */
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  /** An optional handler for the load event. */
  var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  /** An optional function that returns a React element to be shown while the image loads. */
  var preloader: js.UndefOr[js.Function1[/* params */ js.Any, reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
  /** The URL of the image to be loaded. */
  var src: java.lang.String
  /** An optional object containing styles for the wrapper component. */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** A function that takes a props argument and returns a React element to be used as the wrapper component. Defaults to React.DOM.span. */
  var wrapper: js.UndefOr[js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
}

object ImageLoaderProps {
  @scala.inline
  def apply(
    src: java.lang.String,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    imgProps: js.Any = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    onError: js.Function1[/* event */ js.Any, scala.Unit] = null,
    onLoad: js.Function1[/* event */ js.Any, scala.Unit] = null,
    preloader: js.Function1[/* params */ js.Any, reactLib.reactMod.ReactNs.ReactElement[_]] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[ImageLoader] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    wrapper: js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNs.ReactElement[_]] = null
  ): ImageLoaderProps = {
    val __obj = js.Dynamic.literal(src = src)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (imgProps != null) __obj.updateDynamic("imgProps")(imgProps)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (preloader != null) __obj.updateDynamic("preloader")(preloader)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[ImageLoaderProps]
  }
}

