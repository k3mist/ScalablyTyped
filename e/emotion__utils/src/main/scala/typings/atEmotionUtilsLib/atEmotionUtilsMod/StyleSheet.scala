package typings
package atEmotionUtilsLib.atEmotionUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheet extends js.Object {
  var container: stdLib.HTMLElement
  var key: java.lang.String
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var tags: js.Array[stdLib.HTMLStyleElement]
  def flush(): scala.Unit
  def insert(rule: java.lang.String): scala.Unit
}

object StyleSheet {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement,
    flush: () => scala.Unit,
    insert: java.lang.String => scala.Unit,
    key: java.lang.String,
    tags: js.Array[stdLib.HTMLStyleElement],
    nonce: java.lang.String = null
  ): StyleSheet = {
    val __obj = js.Dynamic.literal(container = container, flush = js.Any.fromFunction0(flush), insert = js.Any.fromFunction1(insert), key = key, tags = tags)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[StyleSheet]
  }
}

