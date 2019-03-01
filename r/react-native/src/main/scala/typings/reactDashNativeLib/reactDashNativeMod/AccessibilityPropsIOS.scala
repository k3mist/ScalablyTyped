package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityPropsIOS extends js.Object {
  /**
    * A Boolean value indicating whether the accessibility elements contained within this accessibility element
    * are hidden to the screen reader.
    * @platform ios
    */
  var accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * https://facebook.github.io/react-native/docs/accessibility#accessibilityignoresinvertcolorsios
    * @platform ios
    */
  var accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Accessibility traits tell a person using VoiceOver what kind of element they have selected.
    * Is this element a label? A button? A header? These questions are answered by accessibilityTraits.
    * @platform ios
    */
  var accessibilityTraits: js.UndefOr[
    reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait]
  ] = js.undefined
  /**
    * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
    * @platform ios
    */
  var onAccessibilityTap: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
    * @platform ios
    */
  var onMagicTap: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object AccessibilityPropsIOS {
  @scala.inline
  def apply(
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onMagicTap: js.Function0[scala.Unit] = null
  ): AccessibilityPropsIOS = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    __obj.asInstanceOf[AccessibilityPropsIOS]
  }
}

