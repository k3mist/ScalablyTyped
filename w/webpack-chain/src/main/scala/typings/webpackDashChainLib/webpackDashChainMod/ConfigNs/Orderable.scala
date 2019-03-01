package typings
package webpackDashChainLib.webpackDashChainMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Orderable extends js.Object {
  def after(name: java.lang.String): this.type
  def before(name: java.lang.String): this.type
}

object Orderable {
  @scala.inline
  def apply(
    after: js.Function1[java.lang.String, Orderable],
    before: js.Function1[java.lang.String, Orderable]
  ): Orderable = {
    val __obj = js.Dynamic.literal(after = after, before = before)
  
    __obj.asInstanceOf[Orderable]
  }
}

