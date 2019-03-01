package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetterSpacingProps[TLength] extends js.Object {
  /**
    * The letter-spacing CSS property sets the spacing behavior between text characters.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing)
    */
  var letterSpacing: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.LetterSpacingProperty[TLength]]] = js.undefined
}

object LetterSpacingProps {
  @scala.inline
  def apply[TLength](letterSpacing: ResponsiveValue[csstypeLib.csstypeMod.LetterSpacingProperty[TLength]] = null): LetterSpacingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[LetterSpacingProps[TLength]]
  }
}

