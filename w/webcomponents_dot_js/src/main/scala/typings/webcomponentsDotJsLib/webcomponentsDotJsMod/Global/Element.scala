package typings
package webcomponentsDotJsLib.webcomponentsDotJsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  val shadowRoot: ShadowRoot | scala.Null
  def createShadowRoot(): ShadowRoot
}

object Element {
  @scala.inline
  def apply(createShadowRoot: js.Function0[ShadowRoot], shadowRoot: ShadowRoot = null): Element = {
    val __obj = js.Dynamic.literal(createShadowRoot = createShadowRoot)
    if (shadowRoot != null) __obj.updateDynamic("shadowRoot")(shadowRoot)
    __obj.asInstanceOf[Element]
  }
}

