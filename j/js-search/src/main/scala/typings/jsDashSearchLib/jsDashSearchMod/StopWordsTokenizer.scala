package typings
package jsDashSearchLib.jsDashSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-search", "StopWordsTokenizer")
@js.native
class StopWordsTokenizer protected () extends ITokenizer {
  def this(decoratedTokenizer: ITokenizer) = this()
  /* CompleteClass */
  override def tokenize(text: java.lang.String): js.Array[java.lang.String] = js.native
}

