package typings
package tsmonadLib.libSrcWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriterPatterns[S, T, U] extends js.Object {
  def writer(story: js.Array[S], value: T): U
}

object WriterPatterns {
  @scala.inline
  def apply[S, T, U](writer: js.Function2[js.Array[S], T, U]): WriterPatterns[S, T, U] = {
    val __obj = js.Dynamic.literal(writer = writer)
  
    __obj.asInstanceOf[WriterPatterns[S, T, U]]
  }
}

