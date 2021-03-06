package typings
package dom4Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentNode extends js.Object {
  /**
    * Returns the child elements.
    */
  val children: stdLib.HTMLCollection
  /**
    * Inserts `nodes` after the last child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def append(nodes: (stdLib.Node | java.lang.String)*): scala.Unit
  /**
    * Inserts `nodes` before the first child of this node, while replacing strings with equivalent `Text` nodes.
    */
  def prepend(nodes: (stdLib.Node | java.lang.String)*): scala.Unit
}

object ParentNode {
  @scala.inline
  def apply(
    append: /* repeated */ stdLib.Node | java.lang.String => scala.Unit,
    children: stdLib.HTMLCollection,
    prepend: /* repeated */ stdLib.Node | java.lang.String => scala.Unit
  ): ParentNode = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), children = children, prepend = js.Any.fromFunction1(prepend))
  
    __obj.asInstanceOf[ParentNode]
  }
}

