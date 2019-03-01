package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferList[D /* <: safeDashBufferLib.safeDashBufferMod.Buffer */] extends js.Object {
  var head: Entry[D]
  var length: scala.Double
  var tail: Entry[D]
  def clear(): scala.Unit
  def concat(n: scala.Double): D
  def join(s: js.Any): java.lang.String
  def push(v: D): scala.Unit
  def shift(): D
  def unshift(v: D): scala.Unit
}

object BufferList {
  @scala.inline
  def apply[D /* <: safeDashBufferLib.safeDashBufferMod.Buffer */](
    clear: js.Function0[scala.Unit],
    concat: js.Function1[scala.Double, D],
    head: Entry[D],
    join: js.Function1[js.Any, java.lang.String],
    length: scala.Double,
    push: js.Function1[D, scala.Unit],
    shift: js.Function0[D],
    tail: Entry[D],
    unshift: js.Function1[D, scala.Unit]
  ): BufferList[D] = {
    val __obj = js.Dynamic.literal(clear = clear, concat = concat, head = head, join = join, length = length, push = push, shift = shift, tail = tail, unshift = unshift)
  
    __obj.asInstanceOf[BufferList[D]]
  }
}

