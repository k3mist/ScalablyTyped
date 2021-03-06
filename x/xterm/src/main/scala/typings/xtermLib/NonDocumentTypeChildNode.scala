package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonDocumentTypeChildNode extends js.Object {
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  val nextElementSibling: Element | scala.Null
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  val previousElementSibling: Element | scala.Null
}

object NonDocumentTypeChildNode {
  @scala.inline
  def apply(nextElementSibling: Element = null, previousElementSibling: Element = null): NonDocumentTypeChildNode = {
    val __obj = js.Dynamic.literal()
    if (nextElementSibling != null) __obj.updateDynamic("nextElementSibling")(nextElementSibling)
    if (previousElementSibling != null) __obj.updateDynamic("previousElementSibling")(previousElementSibling)
    __obj.asInstanceOf[NonDocumentTypeChildNode]
  }
}

